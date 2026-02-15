package servicos;

import entidade.Cliente;
import enums.Genero;
import enums.TipoMoeda;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.stream.Collectors;

public class RelatorioServico {
    private ContaServico contaServico;

    public RelatorioServico(ContaServico contaServico) {
        this.contaServico = contaServico;
    }

    public void mostrarClientesMoedaNacional() {
        try {
            List<Cliente> clientes = contaServico.getClientes();
            long count = clientes.stream()
                    .filter(cliente -> cliente != null && cliente.getConta() != null)
                    .filter(cliente -> TipoMoeda.METICAL.equals(cliente.getConta().getTipoMoeda()))
                    .count();
            
            JOptionPane.showMessageDialog(null, 
                "Clientes com moeda nacional (Metical): " + count);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao gerar relatório: " + e.getMessage());
        }
    }

    public void mostrarClientesFemininoDolar() {
        try {
            List<Cliente> clientesFiltrados = contaServico.getClientes().stream()
                    .filter(cliente -> cliente != null)
                    .filter(cliente -> cliente.getGenero() != null && 
                                      Genero.FEMININO.equals(cliente.getGenero()))
                    .filter(cliente -> cliente.getConta() != null && 
                                      TipoMoeda.DOLAR.equals(cliente.getConta().getTipoMoeda()))
                    .collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();
            if (clientesFiltrados.isEmpty()) {
                sb.append("Nenhuma cliente feminina com conta em Dólar encontrada.");
            } else {
                sb.append("Clientes Feminino que usam Dólar:\n");
                clientesFiltrados.forEach(cliente -> 
                    sb.append("- ").append(cliente.getNome()).append("\n"));
            }
            
            JOptionPane.showMessageDialog(null, sb.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao gerar relatório: " + e.getMessage());
        }
    }
}