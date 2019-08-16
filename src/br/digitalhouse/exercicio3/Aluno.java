package br.digitalhouse.exercicio3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private Integer numeroDeAluno;

    public Aluno (String novoNome, Integer novoNumeroDeAluno){
        nome = novoNome;
        numeroDeAluno = novoNumeroDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    //    boolean Search(String nome){
//        if(ArrayList.contains("Tiago")){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

    @Override
    public boolean equals(Object alunoNovo) {
        if (this == alunoNovo){
            return true;
        }
        if (!(alunoNovo instanceof Aluno)){
            return false;
        }
        return this.getNumeroDeAluno() == ((Aluno) alunoNovo).getNumeroDeAluno();
    }



}
