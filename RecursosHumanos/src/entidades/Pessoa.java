package entidades;

import enums.Genero;
import enums.Nacionalidade;

public class Pessoa {
    private String nome;
    private Nacionalidade nacionalidade;
    private int idade;
    private Genero genero;


    public Pessoa() {
    }

    public Pessoa(String nome, Nacionalidade nacionalidade, int idade, Genero genero) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}
