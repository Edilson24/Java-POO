package entidades;

import pessoa.Pessoa;

public class Cliente extends Pessoa{
    private int numeroConta;
    private float saldo;

    public Cliente() {
    }

    public Cliente(int numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
