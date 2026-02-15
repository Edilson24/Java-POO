
package entidade;

import enums.TipoConta;
import enums.TipoMoeda;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta, TipoMoeda tipoMoeda) {
        super(numeroConta, TipoConta.CORRENTE, tipoMoeda);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.10;
        double valorTotal = valor + taxa;
        
        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }
        return false;
    }
}