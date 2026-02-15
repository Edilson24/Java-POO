package entidades;

import enuum.Nacionalidade;

public class Cliente {
    private String titular;
    private double saldo;
    private int idade;
    private int nuit;
    private int numConta;
    private Nacionalidade nacionalidade;

    public Cliente() {
    }

    public Cliente(String titular, double saldo, int idade, int nuit, int numConta, Nacionalidade nacionalidade) {
        this.titular = titular;
        this.saldo = saldo;
        this.idade = idade;
        this.nuit = nuit;
        this.numConta = numConta;
        this.nacionalidade = nacionalidade;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
