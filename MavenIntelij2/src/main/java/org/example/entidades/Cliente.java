package org.example.entidades;

import org.example.enums.Genero;
import org.example.enums.Nacionalidade;
import org.example.enums.TipoConta;
import org.example.enums.TipoMoeda;
import org.example.entidades.Pessoa;

public class Cliente extends Pessoa{
    private String numCOnta;
    private TipoConta tipoConta;
    private TipoMoeda tipoMoeda;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nome, Genero genero, Nacionalidade nacionalidade, String numCOnta, TipoConta tipoConta, TipoMoeda tipoMoeda, float saldo) {
        super(nome, genero, nacionalidade);
        this.numCOnta = numCOnta;
        this.tipoConta = tipoConta;
        this.tipoMoeda = tipoMoeda;
        this.saldo = saldo;
    }

    public String getNumCOnta() {
        return numCOnta;
    }

    public void setNumCOnta(String numCOnta) {
        this.numCOnta = numCOnta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoMoeda getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(TipoMoeda tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}