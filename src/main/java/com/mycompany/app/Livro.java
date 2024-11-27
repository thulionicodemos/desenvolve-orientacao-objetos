package com.mycompany.app;

public class Livro {
    private String titulo;
    private String genero;

    public Livro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
}