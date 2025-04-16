// Endereco.java
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereço: " + rua + ", " + numero + " " + complemento + ", CEP: " + cep + ", " + bairro + ", " + cidade + " - " + estado;
    }
}

// Cliente.java
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente: Nome: " + nome + ", CPF: " + cpf + ", " + endereco;
    }
}

// MainCliente.java
public class MainCliente {
    public static void main(String[] args) {
        Endereco enderecoCliente = new Endereco("Avenida Brasil", 100, "Apto 302", "12345-678", "Centro", "São Paulo", "SP");
        Cliente cliente1 = new Cliente("Carlos", "123.456.789-00", enderecoCliente);
        System.out.println(cliente1);
    }
}