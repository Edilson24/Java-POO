package org.example.entidades;

public class Estudante extends Pessoa{
    private float nota1;
    private float nota2;
    private float pagInic;

    public Estudante() {
    }

    public Estudante(String nome, int ano, float nota1, float nota2, float pagInic) {
        super(nome, ano);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.pagInic = pagInic;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getPagInic() {
        return pagInic;
    }

    public void setPagInic(float pagInic) {
        this.pagInic = pagInic;
    }
}
