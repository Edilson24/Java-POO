package entidades;

import enums.Curso;
import enums.Genero;

public class Estudante extends Pessoa {
    private String numero;
    private int data;
    private Curso curso;

    public Estudante() {
    }

    public Estudante(String nome, Genero genero, int idade, String numero, int data, Curso curso) {
        super(nome, genero, idade);
        this.numero = numero;
        this.data = data;
        this.curso = curso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
