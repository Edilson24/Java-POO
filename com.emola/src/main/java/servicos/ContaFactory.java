package servicos;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaEmpresarial;
import entidade.ContaPoupanca;
import enums.TipoConta;
import enums.TipoMoeda;

public class ContaFactory {
    public static Conta criarConta(TipoConta tipoConta, String numeroConta, TipoMoeda tipoMoeda) {
        switch (tipoConta) {
            case CORRENTE: return new ContaCorrente(numeroConta, tipoMoeda);
            case POUPANCA: return new ContaPoupanca(numeroConta, tipoMoeda);
            case EMPRESARIAL: return new ContaEmpresarial(numeroConta, tipoMoeda);
            default: throw new IllegalArgumentException("Tipo de conta inválido");
        }
    }
}