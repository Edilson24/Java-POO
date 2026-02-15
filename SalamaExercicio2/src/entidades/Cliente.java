package entidades;

import enums.Nacionalidade;
import entidades.Pessoa;
import enums.Nacionalidade;

public class Cliente extends Pessoa{
    private float saldo;
    private int nuit;
    private int numConta;

    public Cliente(String nomeCliente, int idadeCliente, Nacionalidade nacionalidade, float saldoCliente, int nuitClente, int numCliente) {
        super(nomeCliente, idadeCliente, nacionalidade);
        this.saldo = saldo;
        this.nuit = nuit;
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
