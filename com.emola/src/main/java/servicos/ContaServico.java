package servicos;

import arquivo.ExcelServico;
import entidade.Cliente;
import enums.Genero;
import enums.TipoMoeda;
import javax.swing.JOptionPane;
import java.util.List;

public class ContaServico {
    private List<Cliente> clientes;
    private ExcelServico excelServico;

    public ContaServico() {
        this.excelServico = new ExcelServico();
        this.clientes = excelServico.carregarDados();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void criarConta(Cliente cliente) {
        clientes.add(cliente);
        excelServico.salvarDados(clientes);
        JOptionPane.showMessageDialog(null, "Conta criada e salva com sucesso!");
    }

    public void depositar(String numeroConta, double valor) {
        Cliente cliente = buscarCliente(numeroConta);
        if (cliente != null) {
            cliente.getConta().depositar(valor);
            excelServico.salvarDados(clientes);
            JOptionPane.showMessageDialog(null, "Depósito realizado e salvo!");
        }
    }

    public void sacar(String numeroConta, double valor) {
        Cliente cliente = buscarCliente(numeroConta);
        if (cliente != null && cliente.getConta().sacar(valor)) {
            excelServico.salvarDados(clientes);
            JOptionPane.showMessageDialog(null, "Saque realizado e salvo!");
        }
    }

    public void transferir(String contaOrigem, String contaDestino, double valor) {
        Cliente origem = buscarCliente(contaOrigem);
        Cliente destino = buscarCliente(contaDestino);
        
        if (origem != null && destino != null && origem.getConta().sacar(valor)) {
            destino.getConta().depositar(valor);
            excelServico.salvarDados(clientes);
            JOptionPane.showMessageDialog(null, "Transferência realizada e salva!");
        }
    }

    public List<Cliente> listarClientesMoedaNacional() {
        return clientes.stream()
                .filter(c -> c.getConta().getTipoMoeda() == TipoMoeda.METICAL)
                .toList();
    }

    public List<Cliente> listarClientesFemininoDolar() {
        return clientes.stream()
                .filter(c -> c.getGenero() == Genero.FEMININO)
                .filter(c -> c.getConta().getTipoMoeda() == TipoMoeda.DOLAR)
                .toList();
    }

    private Cliente buscarCliente(String numeroConta) {
        return clientes.stream()
                .filter(c -> c.getConta().getNumeroConta().equals(numeroConta))
                .findFirst()
                .orElse(null);
    }
}