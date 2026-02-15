package entidade;

import enums.TipoConta;
import enums.TipoMoeda;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, TipoMoeda tipoMoeda) {
        super(numeroConta, TipoConta.POUPANCA, tipoMoeda);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.10;
        double valorTotal = valor + taxa;
        
        if (saldo >= valorTotal && saldo - valorTotal >= 100) {
            saldo -= valorTotal;
            return true;
        }
        return false;
    }
}