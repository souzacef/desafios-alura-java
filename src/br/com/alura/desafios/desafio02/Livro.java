package br.com.alura.desafios.desafio02;

public class Livro {
    private String titulo, autor;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibeDetalhe() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor + "\n");
    }
}
