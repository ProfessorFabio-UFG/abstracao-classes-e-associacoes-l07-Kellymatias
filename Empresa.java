// Empresa.java
public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empresa: CNPJ: " + cnpj + ", Razão Social: " + razaoSocial + ", " + endereco;
    }
}

// Empregado.java
public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;
    private Endereco endereco;

    public Empregado(String nome, int matricula, Empresa empresa, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empregado: Nome: " + nome + ", Matrícula: " + matricula + ", Trabalha na " + empresa + ", Reside em: " + endereco;
    }
}

// MainEmpregado.java
public class MainEmpregado {
    public static void main(String[] args) {
        Endereco enderecoEmpresa = new Endereco("Rua Industrial", 500, "Sala 101", "54321-000", "Industrial", "Rio de Janeiro", "RJ");
        Empresa empresa1 = new Empresa("12.345.678/0001-99", "Tech Solutions Ltda", enderecoEmpresa);
        Endereco enderecoEmpregado = new Endereco("Rua das Flores", 300, "Casa 2", "87654-321", "Jardim", "Rio de Janeiro", "RJ");
        Empregado empregado1 = new Empregado("Ana", 67890, empresa1, enderecoEmpregado);
        System.out.println(empregado1);
    }
}