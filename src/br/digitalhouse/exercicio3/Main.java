package br.digitalhouse.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();
//        Aluno José = new Aluno("José", 100);
        listaAlunos.add(new Aluno("José", 1));
        listaAlunos.add(new Aluno("Maria", 2));
        listaAlunos.add(new Aluno("João", 3));
        listaAlunos.add(new Aluno("Ezequiel", 4));

        Aluno aluno5 = new Aluno("Tiago", 4);
        Aluno aluno6 = new Aluno("Nazaré", 5);

        System.out.println(listaAlunos.contains(aluno5));

        System.out.println(aluno5.equals(aluno6));

        System.out.println(listaAlunos.contains(aluno5));
    }
}
