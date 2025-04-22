package com.list.ordenanumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numberList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        if (numero >= 0) {
            numberList.add(numero);
        } else {
            System.out.println("Número inválido!");
        }
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numberList);
        if(!this.numberList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numberList);
        if(!this.numberList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return  numerosDescendente;
        } else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "numberList=" + numberList +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        System.out.println(numeros);
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros);
        System.out.println(numeros.ordenarDescendente());
        System.out.println(numeros);
    }
}
