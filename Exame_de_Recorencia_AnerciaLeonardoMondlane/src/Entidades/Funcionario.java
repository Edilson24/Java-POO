package Entidades;

import genero.Genero;
import nacionalidade.Nacionalidade;
import profisao.Profisao;

public class Funcionario extends Pessoa {
    private String anodecontrato;
    private Profisao profisao;

    public Funcionario() {

    }


    public Funcionario(String nome, int idade, String anodenasci, Genero genero, Nacionalidade nacionalidade, Profisao profisao, String anodecontrato) {
        super(nome, idade, anodenasci, genero, nacionalidade);
        this.profisao = profisao;
        this.anodecontrato = anodecontrato;

    }

    public String getAnodecontrato() {
        return anodecontrato;
    }

    public void setAnodecontrato(String anodecontrato) {
        this.anodecontrato = anodecontrato;
    }

    public Profisao getProfisao() {
        return profisao;
    }

    public void setProfisao(Profisao profisao) {
        this.profisao = profisao;
    }
}
