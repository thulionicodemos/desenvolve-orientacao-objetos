public class Pessoa {
    private String nome;
    private Livro[] livros;

    public Pessoa(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}