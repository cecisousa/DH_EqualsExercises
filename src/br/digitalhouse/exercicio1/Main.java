package br.digitalhouse.exercicio1;

public class Main {

    public static void main(String[] args) {

        Pessoa cecilia = new Pessoa("Cecilia", 115);
        Pessoa patricia = new Pessoa("Patricia", 115);

        System.out.println(cecilia.equals(patricia));
    }
}
