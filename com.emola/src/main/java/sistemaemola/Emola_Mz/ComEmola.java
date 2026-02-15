package sistemaemola.Emola_Mz;

import entidade.Cliente;
import entidade.Conta;
import javax.swing.JOptionPane;
import enums.Genero;
import enums.Pais;
import enums.TipoConta;
import enums.TipoMoeda;
import servicos.Autenticao;
import servicos.ContaFactory;
import servicos.ContaServico;
import servicos.RelatorioServico;

public class ComEmola {
    private static ContaServico contaServico = new ContaServico();
    private static RelatorioServico relatorioServico = new RelatorioServico(contaServico);

    public static void main(String[] args) {
        if (!Autenticao.autenticar()) return;

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                "=== SISTEMA E-MOLA ===\n" +
                "1. Criar nova conta\n" +
                "2. Realizar depósito\n" +
                "3. Realizar saque\n" +
                "4. Transferência entre contas\n" +
                "5. Relatório: Clientes com moeda nacional\n" +
                "6. Relatório: Clientes femininos com Dólar\n" +
                "7. Sair\n\n" +
                "Digite a opção desejada:");

            switch (opcao) {
                case "1": criarConta(); break;
                case "2": realizarDeposito(); break;
                case "3": realizarSaque(); break;
                case "4": realizarTransferencia(); break;
                case "5": relatorioServico.mostrarClientesMoedaNacional(); break;
                case "6": relatorioServico.mostrarClientesFemininoDolar(); break;
                case "7": sair(); return;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void criarConta() {
        try {
            String nome = JOptionPane.showInputDialog("Nome completo:");
            Genero genero = (Genero) JOptionPane.showInputDialog(null, "Gênero:", "Selecione", 
                JOptionPane.QUESTION_MESSAGE, null, Genero.values(), Genero.MASCULINO);
            
            TipoConta tipoConta = (TipoConta) JOptionPane.showInputDialog(null, "Tipo de conta:", "Selecione", 
                JOptionPane.QUESTION_MESSAGE, null, TipoConta.values(), TipoConta.CORRENTE);
            
            TipoMoeda tipoMoeda = (TipoMoeda) JOptionPane.showInputDialog(null, "Tipo de moeda:", "Selecione", 
                JOptionPane.QUESTION_MESSAGE, null, TipoMoeda.values(), TipoMoeda.METICAL);
            
            Pais pais = (Pais) JOptionPane.showInputDialog(null, "País:", "Selecione", 
                JOptionPane.QUESTION_MESSAGE, null, Pais.values(), Pais.NACIONAL);
            
            String numeroConta = JOptionPane.showInputDialog("Número da conta:");
            double saldoInicial = 0;
            
            String deposito = JOptionPane.showInputDialog("Depósito inicial (opcional):");
            if (deposito != null && !deposito.isEmpty()) {
                saldoInicial = Double.parseDouble(deposito);
            }
            
            Conta conta = ContaFactory.criarConta(tipoConta, numeroConta, tipoMoeda);
            conta.depositar(saldoInicial);
            
            Cliente cliente = new Cliente(nome, genero, conta, pais);
            contaServico.criarConta(cliente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar conta: " + e.getMessage());
        }
    }

    private static void realizarDeposito() {
        String numeroConta = JOptionPane.showInputDialog("Número da conta:");
        String valorStr = JOptionPane.showInputDialog("Valor a depositar:");
        
        try {
            double valor = Double.parseDouble(valorStr);
            contaServico.depositar(numeroConta, valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao depositar: " + e.getMessage());
        }
    }

    private static void realizarSaque() {
        String numeroConta = JOptionPane.showInputDialog("Número da conta:");
        String valorStr = JOptionPane.showInputDialog("Valor a sacar:");
        
        try {
            double valor = Double.parseDouble(valorStr);
            contaServico.sacar(numeroConta, valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao sacar: " + e.getMessage());
        }
    }

    private static void realizarTransferencia() {
        String contaOrigem = JOptionPane.showInputDialog("Conta de origem:");
        String contaDestino = JOptionPane.showInputDialog("Conta de destino:");
        String valorStr = JOptionPane.showInputDialog("Valor a transferir:");
        
        try {
            double valor = Double.parseDouble(valorStr);
            contaServico.transferir(contaOrigem, contaDestino, valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao transferir: " + e.getMessage());
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Obrigado por usar o E-Mola!");
        System.exit(0);
    }
}