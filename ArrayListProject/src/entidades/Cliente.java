package entidades;

import enums.Genero;
import enums.Nacionalidade;
import enums.TipoConta;
import enums.TipoMoeda;

public class Cliente extends Pessoa{
    private String numeroConta;
    private float saldo;
    private TipoConta tipoConta;
    private TipoMoeda tipoMoeda;

    public Cliente() {
    }

    public Cliente(String nome, Genero genero, Nacionalidade nacionalidade, String numeroConta, float saldo, TipoConta tipoConta, TipoMoeda tipoMoeda) {
        super(nome, genero, nacionalidade);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.tipoMoeda = tipoMoeda;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
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

    public TipoMoeda getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(TipoMoeda tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }
}
