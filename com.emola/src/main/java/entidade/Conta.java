
package entidade;

import enums.TipoConta;
import enums.TipoMoeda;

public abstract class Conta {
    protected String numeroConta;
    protected double saldo;
    protected TipoConta tipoConta;
    protected TipoMoeda tipoMoeda;

    public Conta(String numeroConta, TipoConta tipoConta, TipoMoeda tipoMoeda) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.tipoMoeda = tipoMoeda;
        this.saldo = 0.0;
    }

    public String getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }
    public TipoConta getTipoConta() { return tipoConta; }
    public TipoMoeda getTipoMoeda() { return tipoMoeda; }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public abstract boolean sacar(double valor);
}