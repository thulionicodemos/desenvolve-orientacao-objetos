package com.mycompany.app;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1", "Ficção");
        Livro livro2 = new Livro("Livro 2", "Poesia");

        Livro[] livros1 = {livro1, livro2};
        Autor autor1 = new Autor("Carlos Drummond de Andrade", livros1, "Brasileira");

        Livro[] livros2 = {new Livro("Livro 3", "Fantasia")};
        Autor autor2 = new Autor("George R. R. Martin", livros2, "Norte-Americana");

        Autor[] autores = {autor1, autor2};

        for (Autor autor : autores) {
            for (Livro livro : autor.getObrasPublicadas()) {
                System.out.println(livro.getTitulo());
            }
        }
    }
}