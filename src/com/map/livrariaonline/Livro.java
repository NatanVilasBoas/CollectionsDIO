package com.map.livrariaonline;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private Double preco;

    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(this.getPreco(), l.getPreco());
    }

    @Override
    public String toString() {
        return "\n{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
