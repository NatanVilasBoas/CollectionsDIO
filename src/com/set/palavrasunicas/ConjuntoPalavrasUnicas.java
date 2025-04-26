package com.set.palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> wordsList = new HashSet<>();

    public ConjuntoPalavrasUnicas() {
        wordsList = new HashSet<>();
    }

    ;

    public void adicionarPalavra(String palavra) {
        wordsList.add(palavra);
    }

    ;

    public void removerPalavra(String palavra) {
        if (!wordsList.isEmpty()) {
            if (wordsList.contains(palavra)) wordsList.remove(palavra);
            else System.out.println("Palavra não encontrada");
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void verificarPalavra(String palavra) {
        if (wordsList.contains(palavra)) {
            System.out.println("A lista contém a palavra: " + palavra);
        } else {
            System.out.println("Essa palavra não está na lista.");
        }
    }

    public void exibirPalavrasUnicas() {
        if (this.wordsList.isEmpty()) {
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println(this.wordsList);
    }

    @Override
    public String toString() {
        return "{" +
                "wordsList=" + wordsList +
                '}';
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas list = new ConjuntoPalavrasUnicas();

        list.adicionarPalavra("Ola");
        list.adicionarPalavra("estacionamento");
        list.adicionarPalavra("estacionamento");
        list.adicionarPalavra("parque");
        list.exibirPalavrasUnicas();
        list.removerPalavra("parque");
        list.exibirPalavrasUnicas();
        list.verificarPalavra("estacionamento");
        list.verificarPalavra("estaciono");
    }
}
