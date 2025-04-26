package com.set.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet = new HashSet<>();

    public ListaTarefas() {
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = new Tarefa(descricao);
        if (this.tarefaSet.isEmpty()) {
            System.out.println("Não há tarefas na lista!");
        } else if (this.tarefaSet.contains(tarefaParaRemover)) {
            this.tarefaSet.remove(tarefaParaRemover);
        } else System.out.println("Tarefa não encontrada!");
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (this.tarefaSet.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            for (Tarefa tarefa : this.tarefaSet) {
                if (tarefa.isConcluida()) tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (this.tarefaSet.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            for (Tarefa tarefa : this.tarefaSet) {
                if (!tarefa.isConcluida()) tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaParaConcluir = new Tarefa(descricao);
        if (this.tarefaSet.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else if (this.tarefaSet.contains(tarefaParaConcluir)) {
            for(Tarefa tarefa: this.tarefaSet){
                if(tarefa.equals(tarefaParaConcluir)){
                    tarefa.setConcluida(true);
                }
            }
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = new Tarefa(descricao);
        if(this.tarefaSet.isEmpty()){
            System.out.println("A lista está vazia!");
        } else if(this.tarefaSet.contains(tarefaPendente)){
            for(Tarefa tarefa: this.tarefaSet){
                if (tarefa.equals(tarefaPendente)){
                    tarefa.setConcluida(false);
                }
            }
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void limparListaTarefas(){
        this.tarefaSet.clear();
    }

    public static void main(String[] args){
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");
        tarefas.adicionarTarefa("Tarefa 4");
        tarefas.exibirTarefas();
        tarefas.contarTarefas();
        tarefas.removerTarefa("Tarefa 2");
        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Tarefa 1");
        tarefas.marcarTarefaConcluida("Tarefa 4");
        System.out.println(tarefas.obterTarefasConcluidas());
        tarefas.marcarTarefaPendente("Tarefa 1");
        System.out.println(tarefas.obterTarefasPendentes());
        tarefas.exibirTarefas();

        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }
}
