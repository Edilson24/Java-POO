/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Cursos;

/**
 *
 * @author hp
 */
public class Estudante extends Pessoa{
    private int numEstudante;
    private Cursos curso;

    public Estudante() {
    }

    public Estudante(int numEstudante, Cursos curso) {
        this.numEstudante = numEstudante;
        this.curso = curso;
    }

    public int getNumEstudante() {
        return numEstudante;
    }

    public void setNumEstudante(int numEstudante) {
        this.numEstudante = numEstudante;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
    
    
    
    
}
