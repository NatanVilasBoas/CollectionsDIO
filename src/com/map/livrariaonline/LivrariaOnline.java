package com.map.livrariaonline;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livros = new HashMap<>();

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!this.livros.isEmpty()) {
            String linkLivroParaRemover = "";
            for (Map.Entry<String, Livro> l : this.livros.entrySet()) {
                if (l.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    linkLivroParaRemover = l.getKey();
                }
            }
            if (!linkLivroParaRemover.isEmpty()) {
                this.livros.remove(linkLivroParaRemover);
            } else {
                System.out.println("Livro não encontrado");
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Set<Livro> livrosOrdenados = new TreeSet<>(this.livros.values());
        System.out.println(livrosOrdenados);
    }

    public void pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.livros.isEmpty()) {
            for (Livro l : this.livros.values()) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            if (!livrosPorAutor.isEmpty()) {
                System.out.println(livrosPorAutor);
            } else {
                System.out.println("Não foi encontrado livros do autor informado");
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void obterLivroMaisCaro() {
        if (!this.livros.isEmpty()) {
            String linkLivroMaisCaro = "";
            Double maisCaro = Double.MIN_VALUE;
            for (Map.Entry<String, Livro> l : this.livros.entrySet()) {
                if (l.getValue().getPreco() > maisCaro) {
                    maisCaro = l.getValue().getPreco();
                    linkLivroMaisCaro = l.getKey();
                }
            }
            System.out.println(this.livros.get(linkLivroMaisCaro));
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirLivroMaisBarato(){
        if (!this.livros.isEmpty()) {
            String linkLivroMaisBarato = "";
            Double maisbarato = Double.MAX_VALUE;
            for (Map.Entry<String, Livro> l : this.livros.entrySet()) {
                if (l.getValue().getPreco() < maisbarato) {
                    maisbarato = l.getValue().getPreco();
                    linkLivroMaisBarato = l.getKey();
                }
            }
            System.out.println(this.livros.get(linkLivroMaisBarato));
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args){
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("111", "Livro 1", "Natan", 25);
        livrariaOnline.adicionarLivro("222", "Livro 2", "Natan", 10);
        livrariaOnline.adicionarLivro("333", "Livro 3", "João", 50);
        livrariaOnline.adicionarLivro("444", "Livro 4", "Amanda", 150);
        livrariaOnline.adicionarLivro("555", "Livro 5", "João", 30);
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
//        livrariaOnline.removerLivro("Livro 3");
//        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        livrariaOnline.exibirLivroMaisBarato();
        livrariaOnline.obterLivroMaisCaro();
        livrariaOnline.pesquisarLivrosPorAutor("Natan");
    }
}
