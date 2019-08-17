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

    public boolean equals(Aluno umAluno) {
        return this.numeroDeAluno.equals(umAluno.getNumeroDeAluno());
    }
}
