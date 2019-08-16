package br.digitalhouse.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("José");
        listaAlunos.add("Maria");
        listaAlunos.add("João");
        listaAlunos.add("Dalila");

        Aluno alunoNovo = new Aluno("Tiago", 123456);

        System.out.println(alunoNovo.equals("José"));

    }
}
