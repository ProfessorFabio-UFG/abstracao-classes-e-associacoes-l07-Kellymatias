import java.util.ArrayList;

// Cenário 1: Músicas e Compositores
class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor{nome='" + nome + "', nacionalidade='" + nacionalidade + "'}";
    }
}

class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome, int ano, String tipo, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "Musica{nome='" + nome + "', ano=" + ano + ", tipo='" + tipo + "', compositor=" + compositor + "}";
    }
}

// Cenário 2: Alunos, Cursos e Departamentos
class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Departamento{nome='" + nome + "', sigla='" + sigla + "'}";
    }
}

class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso(String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Curso{nome='" + nome + "', sigla='" + sigla + "', departamento=" + departamento + "}";
    }
}

class Aluno {
    private String nome;
    private String matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, String matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula='" + matricula + "', ano=" + ano + ", curso=" + curso + "}";
    }
}

// Cenário 3: Clientes e Endereços
class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String complemento, String cep,
                    String bairro, String cidade, String estado) {
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
        return "Endereco{" + rua + ", " + numero + (complemento.isEmpty() ? "" : ", " + complemento) +
               ", " + bairro + ", " + cidade + ", " + estado + ", CEP=" + cep + "}";
    }
}

class Cliente {
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
        return "Cliente{nome='" + nome + "', cpf='" + cpf + "', endereco=" + endereco + "}";
    }
}

// Cenário 4: Empregados e Empresas
class Empresa {
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
        return "Empresa{cnpj='" + cnpj + "', razaoSocial='" + razaoSocial + "', endereco=" + endereco + "}";
    }
}

class Empregado {
    private String nome;
    private String matricula;
    private Empresa empresa;
    private Endereco endereco;

    public Empregado(String nome, String matricula, Empresa empresa, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empregado{nome='" + nome + "', matricula='" + matricula + "', empresa=" + empresa + ", endereco=" + endereco + "}";
    }
}

// Classe principal para testar todos os cenários
public class LabAssociacoes {
    public static void main(String[] args) {
        // Cenário 1
        Compositor c1 = new Compositor("Chico Buarque", "Brasileiro");
        Musica m1 = new Musica("A Banda", 1966, "MPB", c1);
        System.out.println(m1);

        // Cenário 2
        Departamento d1 = new Departamento("Engenharia", "ENG");
        Curso curso1 = new Curso("Engenharia Civil", "ECIV", d1);
        Aluno a1 = new Aluno("Maria Silva", "2024001", 2024, curso1);
        System.out.println(a1);

        // Cenário 3
        Endereco end1 = new Endereco("Rua das Flores", "123", "Apto 45", "12345-678",
                                     "Centro", "Goiânia", "GO");
        Cliente cli1 = new Cliente("João Pereira", "123.456.789-00", end1);
        System.out.println(cli1);

        // Cenário 4
        Empresa emp1 = new Empresa("12.345.678/0001-99", "Tech Solutions Ltda.", end1);
        Empregado empg1 = new Empregado("Ana Costa", "EMP001", emp1, end1);
        System.out.println(empg1);
    }
}
