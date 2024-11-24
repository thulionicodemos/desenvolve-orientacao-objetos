import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("O Alquimista", null, "Ficção", true);
        Livro livro2 = new Livro("Brida", null, "Romance", true);

        // Associando os livros ao autor
        Livro[] obras = {livro1, livro2};
        Autor autor = new Autor("Paulo Coelho", obras, "Brasileira");

        // Configurando o autor nos livros
        livro1 = new Livro("O Alquimista", autor, "Ficção", true);
        livro2 = new Livro("Brida", autor, "Romance", true);

        // Exibindo informações do autor
        System.out.println("Nome do autor: " + autor.getNome());
        System.out.println("Nacionalidade: " + autor.getNacionalidade());

        // Exibindo todas as obras do autor
        System.out.println("\nObras publicadas:");
        for (Livro livro : autor.getObrasPublicadas()) {
            if (livro != null) {
                System.out.println("- " + livro.getTitulo() + " (" + livro.getGenero() + ")");
            }
        }

        // Filtrando obras por gênero
        String generoDesejado = "Ficção";
        System.out.println("\nObras de " + generoDesejado + ":");
        Livro[] obrasFiltradas = autor.getObrasPublicadasPorGenero(generoDesejado);
        for (Livro livro : obrasFiltradas) {
            if (livro != null) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}