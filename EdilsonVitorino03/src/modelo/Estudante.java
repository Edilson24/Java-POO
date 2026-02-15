/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import enums.Genero;

/**
 *
 * @author hp
 */
public class Estudante extends Pessoa{
    private double nota_1;
    private double nota_2;

    public Estudante() {
    }

    public Estudante(double nota_1, double nota_2, String nome, int idade, Genero genero) {
        super(nome, idade, genero);
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    

    public double getNota1() {
        return nota_1;
    }

    public void setNota1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota2() {
        return nota_2;
    }

    public void setNota_(double nota_2) {
        this.nota_2 = nota_2;
    }
}