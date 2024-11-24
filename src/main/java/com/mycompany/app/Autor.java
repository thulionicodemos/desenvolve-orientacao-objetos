public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, Livro[] livros, String nacionalidade) {
        super(nome, livros); // Chama o construtor da classe Pessoa para inicializar nome e livros
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return getLivros(); // Utiliza o método getLivros() da classe Pessoa
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        Livro[] obras = getLivros(); // Pega as obras através do método herdado
        Livro[] filtrados = new Livro[obras.length];
        int contador = 0;

        for (Livro livro : obras) {
            if (livro != null && livro.getGenero().equalsIgnoreCase(genero)) {
                filtrados[contador++] = livro;
            }
        }

        Livro[] resultado = new Livro[contador];
        System.arraycopy(filtrados, 0, resultado, 0, contador);
        return resultado;
    }
}