package br.digitalhouse.exercicio2;

public class Main {

    public static void main(String[] args) {
        Coca zero = new Coca(43, 3.90);
        Coca cafe = new Coca(43, 5.90);

        System.out.println(zero.equals(cafe));
    }
}
