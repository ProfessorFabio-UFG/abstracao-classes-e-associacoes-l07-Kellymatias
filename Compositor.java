// Compositor.java
public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor: Nome: " + nome + ", Nacionalidade: " + nacionalidade;
    }
}

// Musica.java
public class Musica {
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
        return "Música: Nome: " + nome + ", Ano: " + ano + ", Tipo: " + tipo + ", " + compositor;
    }
}

// MainMusica.java
public class MainMusica {
    public static void main(String[] args) {
        Compositor compositor1 = new Compositor("John Williams", "Americano");
        Musica musica1 = new Musica("Star Wars Theme", 1977, "Orquestral", compositor1);
        System.out.println(musica1);
    }
}