package com.list.carrinhodecompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList = new ArrayList<>();

    public CarrinhoDeCompras(){};

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!this.itemList.isEmpty()){
            for(Item i: this.itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }

            this.itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        if(!this.itemList.isEmpty()){
            for(Item i: this.itemList){
                valorTotal += (i.getPreco() * i.getQuantidade());
            }

            System.out.println("O valor total do carrinho é: " + valorTotal);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if(!this.itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras: {" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lápis", (double)2.0F, 3);
        carrinhoDeCompras.adicionarItem("Lápis", (double)2.0F, 3);
        carrinhoDeCompras.adicionarItem("Caderno", (double)35.0F, 1);
        carrinhoDeCompras.adicionarItem("Borracha", (double)2.0F, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}