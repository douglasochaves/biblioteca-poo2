package entities;

public class Emprestimo {

    private String nome;

    private String livro;

    public Emprestimo(String nome, String livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
}
