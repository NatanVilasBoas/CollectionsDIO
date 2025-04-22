package com.list.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numberList = new ArrayList<>();

    public void adicionarNumero(int number) {
        if (number >= 0) {
            numberList.add(number);
        } else {
            System.out.println("número inválido");
        }
    }

    public int calcularSoma() {
        int total = 0;
        if (!this.numberList.isEmpty()) {
            for (int number : numberList) {
                total += number;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (this.numberList.isEmpty()) throw new RuntimeException("A lista está vazia!");
        for (int number : numberList) {
            if (number > maiorNumero) {
                maiorNumero = number;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        Integer menorNumero = null;
        if (this.numberList.isEmpty()) throw new RuntimeException("A lista está vazia!");
        for (int number : numberList) {
            if(menorNumero == null){
                menorNumero = number;
            } else if (number  < menorNumero) {
                menorNumero = number;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(this.numberList);
    }

    @Override
    public String toString() {
        return "{" +
                "numberList=" + numberList +
                '}';
    }


    public static void main(String[] args){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();

        System.out.println("O valor total é: " + somaNumeros.calcularSoma());


        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
    }
}
