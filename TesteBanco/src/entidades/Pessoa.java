package entidades;
//Edilson Vitorino Hilario

import enums.Genero;
import enums.Nacionalidade;

public class Pessoa {
    private String nome;
    private Genero genero;
    private Nacionalidade nacionalidade;

    public Pessoa() {
    }

    public Pessoa(Nacionalidade nacionalidade, Genero genero, String nome) {
        this.nacionalidade = nacionalidade;
        this.genero = genero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
