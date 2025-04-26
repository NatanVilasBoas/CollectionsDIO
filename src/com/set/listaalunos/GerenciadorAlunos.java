package com.set.listaalunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunosParaRemover = new HashSet<>();
        if (this.alunoSet.isEmpty()) {
            System.out.println("A lsita está vazia!");
        } else {
            for (Aluno aluno : this.alunoSet) {
                if (aluno.getMatricula().equals(matricula)) {
                    alunosParaRemover.add(aluno);
                }
            }
            if (alunosParaRemover.isEmpty()) {
                System.out.println("Aluno não encontrado");
            } else {
                this.alunoSet.removeAll(alunosParaRemover);
            }
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<Aluno>(this.alunoSet);
        if(!this.alunoSet.isEmpty()){
            System.out.println(alunosPorNome);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!this.alunoSet.isEmpty()){
            alunosPorNota.addAll(this.alunoSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirAlunos(){
        System.out.println(this.alunoSet);
    }

    public static void main(String[] args){
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Antonio", 123L, 6);
        gerenciadorAlunos.adicionarAluno("Maria", 125L, 6.5);
        gerenciadorAlunos.adicionarAluno("João", 124L, 4.5);
        gerenciadorAlunos.adicionarAluno("Giovana", 128L, 9);
        gerenciadorAlunos.adicionarAluno("Natan", 128L, 7);
        gerenciadorAlunos.exibirAlunos();
//        gerenciadorAlunos.removerAluno(124L);
//        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.exibirAlunosPorNome();

    }
}
