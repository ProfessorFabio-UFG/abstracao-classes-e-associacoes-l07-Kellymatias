// Departamento.java
public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Departamento: " + nome + " (" + sigla + ")";
    }
}

// Curso.java
public class Curso {
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
        return "Curso: " + nome + " (" + sigla + "), " + departamento;
    }
}

// Aluno.java
public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: Nome: " + nome + ", Matrícula: " + matricula + ", Ano: " + ano + ", " + curso;
    }
}

// MainAluno.java
public class MainAluno {
    public static void main(String[] args) {
        Departamento depInfo = new Departamento("Informática", "INF");
        Curso cursoCC = new Curso("Ciência da Computação", "CC", depInfo);
        Aluno aluno1 = new Aluno("Maria", 12345, 2023, cursoCC);
        System.out.println(aluno1);
    }
}