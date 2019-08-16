package br.digitalhouse.exercicio1;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa (String novoNome, Integer novoRG){
        nome = novoNome;
        rg = novoRG;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Pessoa)){
            return false;
        }
        return this.getRg() == ((Pessoa) obj).getRg();
    }


    public String getNome() {
        return nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }
}
