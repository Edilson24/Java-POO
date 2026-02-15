package org.example.entidades;

import org.example.enums.Genero;
import org.example.enums.Nacionalidade;

public class Pessoa {
    private String nome;
    private Genero genero;
    private Nacionalidade nacionalidade;

    public Pessoa() {
    }

    public Pessoa(String nome, Genero genero, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
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