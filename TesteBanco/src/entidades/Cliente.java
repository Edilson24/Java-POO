package entidades;

//Edilson Vitorino Hilario

import enums.Genero;
import enums.Moeda;
import enums.Nacionalidade;
import enums.TipoConta;

public class Cliente extends Pessoa{
    private int numConta;
    private float saldo;
    private TipoConta tipoConta;
    private Moeda moeda;


    public Cliente() {
    }

    public Cliente(String nomeCliente, Genero genero, Nacionalidade nacionalidade, int numCont, int saldoCliente, TipoConta tipoConta, Moeda moeda) {
        super(nacionalidade, genero, nomeCliente);
        this.numConta = numConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.moeda = moeda;

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }
}
