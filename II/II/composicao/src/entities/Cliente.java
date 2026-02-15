/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.Destino;
import enums.Genero;

/**
 *
 * @author mussa
 */
public class Cliente {
    
    private String nome;
    private  Genero genero;
    private Destino destino;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, Genero genero, Destino destino, Endereco endereco) {
        this.nome = nome;
        this.genero = genero;
        this.destino = destino;
        this.endereco = endereco;
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

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

  
}
