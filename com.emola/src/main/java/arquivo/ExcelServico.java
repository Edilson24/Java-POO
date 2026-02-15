package arquivo;

import entidade.Cliente;
import entidade.Conta;
import enums.Genero;
import enums.Pais;
import enums.TipoConta;
import enums.TipoMoeda;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import servicos.ContaFactory;

public class ExcelServico {
    private static final String FILE_PATH = "database/emola_database.xlsx";
    private static final String SHEET_NAME = "Clientes";

    public void salvarDados(List<Cliente> clientes) {
        criarDiretorioSeNaoExistir();
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet(SHEET_NAME);
            criarCabecalho(sheet);
            preencherDados(clientes, sheet);
            ajustarTamanhoColunas(sheet);
            salvarArquivo(workbook);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no Excel: " + e.getMessage());
        }
    }

    public List<Cliente> carregarDados() {
        List<Cliente> clientes = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return clientes;

        try (Workbook workbook = WorkbookFactory.create(file)) {
            Sheet sheet = workbook.getSheet(SHEET_NAME);
            if (sheet == null) return clientes;

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;
                Cliente cliente = lerLinhaCliente(row);
                if (cliente != null) clientes.add(cliente);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do Excel: " + e.getMessage());
        }
        return clientes;
    }

    private void criarDiretorioSeNaoExistir() {
        File diretorio = new File("database");
        if (!diretorio.exists()) diretorio.mkdirs();
    }

    private void criarCabecalho(Sheet sheet) {
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Nome", "Gênero", "Número Conta", "Tipo Conta", "Tipo Moeda", "País", "Saldo"};
        for (int i = 0; i < headers.length; i++) {
            headerRow.createCell(i).setCellValue(headers[i]);
        }
    }

    private void preencherDados(List<Cliente> clientes, Sheet sheet) {
        int rowNum = 1;
        for (Cliente cliente : clientes) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(cliente.getNome());
            row.createCell(1).setCellValue(cliente.getGenero().toString());
            row.createCell(2).setCellValue(cliente.getConta().getNumeroConta());
            row.createCell(3).setCellValue(cliente.getConta().getTipoConta().toString());
            row.createCell(4).setCellValue(cliente.getConta().getTipoMoeda().toString());
            row.createCell(5).setCellValue(cliente.getPais().toString());
            row.createCell(6).setCellValue(cliente.getConta().getSaldo());
        }
    }

    private void ajustarTamanhoColunas(Sheet sheet) {
        for (int i = 0; i < 7; i++) sheet.autoSizeColumn(i);
    }

    private void salvarArquivo(Workbook workbook) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(FILE_PATH)) {
            workbook.write(outputStream);
        }
    }

    private Cliente lerLinhaCliente(Row row) {
        try {
            String nome = row.getCell(0).getStringCellValue();
            Genero genero = Genero.valueOf(row.getCell(1).getStringCellValue());
            String numeroConta = row.getCell(2).getStringCellValue();
            TipoConta tipoConta = TipoConta.valueOf(row.getCell(3).getStringCellValue());
            TipoMoeda tipoMoeda = TipoMoeda.valueOf(row.getCell(4).getStringCellValue());
            Pais pais = Pais.valueOf(row.getCell(5).getStringCellValue());
            double saldo = row.getCell(6).getNumericCellValue();

            Conta conta = ContaFactory.criarConta(tipoConta, numeroConta, tipoMoeda);
            conta.depositar(saldo);
            return new Cliente(nome, genero, conta, pais);
        } catch (Exception e) {
            System.err.println("Erro ao ler linha do Excel: " + e.getMessage());
            return null;
        }
    }
}