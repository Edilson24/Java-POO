package entidades;

import enums.Nacionalidade;

public class Pessoa {
    private String titular;
    private int idade;
    private Nacionalidade nacionalidade;


    public Pessoa(String titular, int idade,Nacionalidade nacionalidade) {
        this.titular = titular;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


}
