package com.map.contagempalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavras = new HashMap<>();

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavras.isEmpty()) {
            if(this.palavras.containsKey(palavra)){
                this.palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(this.palavras);
    }

    public void encontrarPalavraMaisFrequente(){
        String palavraMaisFrquente = "";
        Integer maiorContagem = 0;
        for(Map.Entry<String, Integer> p: this.palavras.entrySet()){
            if(p.getValue() > maiorContagem){
                maiorContagem = p.getValue();
                palavraMaisFrquente = p.getKey();
            }
        }
        System.out.println("A palavra mais frequente é: " + palavraMaisFrquente + " Contagem: " + maiorContagem);
    }

    public static void main(String[] args){
        ContagemPalavras contador = new ContagemPalavras();

        contador.adicionarPalavra("Palavra 1", 1);
        contador.adicionarPalavra("Palavra 2", 5);
        contador.adicionarPalavra("Palavra 3", 3);
        contador.exibirContagemPalavras();
        contador.encontrarPalavraMaisFrequente();
        contador.removerPalavra("Palavra 2");
        contador.exibirContagemPalavras();
        contador.encontrarPalavraMaisFrequente();
    }
}
