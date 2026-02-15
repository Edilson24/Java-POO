package Entidades;

import genero.Genero;
import nacionalidade.Nacionalidade;

public class Pessoa {
    private String nome;
    private int idade;
    private String anodenasci;
    private Genero genero;
    private Nacionalidade nacionalidade;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String anodenasci, Genero genero, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.anodenasci = anodenasci;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAnodenasci() {
        return anodenasci;
    }

    public void setAnodenasci(String anodenasci) {
        this.anodenasci = anodenasci;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
