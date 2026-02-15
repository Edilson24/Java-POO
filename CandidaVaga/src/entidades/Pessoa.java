package entidades;

import enums.Genero;
import enums.Nacionalidade;

public class Pessoa {
    private String nomeCompleto;
    private int idade;
    private Nacionalidade nacionalidade;
    private Genero genero;

    public Pessoa() {
    }

    public Pessoa(String nomeCompleto, int idade, Nacionalidade nacionalidade, Genero genero) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
