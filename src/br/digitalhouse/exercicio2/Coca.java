package br.digitalhouse.exercicio2;

public class Coca {
    private Integer tamanho;
    private Double preco;

    public Coca (Integer novoTamanho, Double novoPreco){
        tamanho = novoTamanho;
        preco = novoPreco;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object zero) {
        if (this == zero){
            return true;
        }
        if (!(zero instanceof Coca)){
            return false;
        }
        return this.getTamanho() == ((Coca) zero).getTamanho();
    }

}
