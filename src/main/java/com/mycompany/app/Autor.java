package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private Livro[] obrasPublicadas;
    private String nacionalidade;

    public Autor(String nome, Livro[] obrasPublicadas, String nacionalidade) {
        this.nome = nome;
        this.obrasPublicadas = obrasPublicadas;
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        List<Livro> filtrados = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equals(genero)) {
                filtrados.add(livro);
            }
        }
        return filtrados.toArray(new Livro[0]);
    }
}