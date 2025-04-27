package com.map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavrasMap = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao){
        this.palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!this.palavrasMap.isEmpty()){
            if(this.palavrasMap.containsKey(palavra)){
                this.palavrasMap.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirPalavras(){
        if(!this.palavrasMap.isEmpty()){
            System.out.println(this.palavrasMap);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void pesquisarPorPalavra(String palavra){
        if(!this.palavrasMap.isEmpty()){
            if(this.palavrasMap.containsKey(palavra)){
                System.out.println("Descrição da palavra: " + this.palavrasMap.get(palavra));
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main (String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Amor", "Ato de amar");
        dicionario.adicionarPalavra("Pegar", "Ato de pegar algo");
        dicionario.adicionarPalavra("Carroça", "Meio de transporte de carga ou pessoa por animais");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Amor");
        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Pegar");
    }
}
