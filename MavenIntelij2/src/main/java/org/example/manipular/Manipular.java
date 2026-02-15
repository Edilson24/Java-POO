package org.example.manipular;

import org.example.entidades.Cliente;
import org.example.enums.Genero;
import org.example.enums.Nacionalidade;
import org.example.enums.TipoConta;
import org.example.enums.TipoMoeda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;

public class Manipular {
    private List<Cliente> listaClientes;

    public Manipular(){
         listaClientes = new ArrayList<>();
    }

    public void CadastrarCliente(){
        Scanner input = new Scanner(System.in);

        float deposito = 0, saldo = 0;
        String nome ="";
        String numConta;
        int numContaInt = 0;

        JOptionPane.showMessageDialog (null, "Podemos prosseguir com o cadastro");
        System.out.println("--------------------------------");


        nome = JOptionPane.showInputDialog("Qual o seu nome: ");

        //Enum de Genero
        System.out.println();
        Genero genero = null;
        while (genero == null){

            String opcaog = JOptionPane.showInputDialog("1 - MASCULINO\n2 - FEMENINO\nQual o seu genero: ");

            switch (opcaog){
                case "1":
                    genero = Genero.MASCULINO;
                    break;

                case "2":
                    genero = Genero.FEMENINO;
                    break;

                default:
                    System.out.println("OPCAO INVALIDADA. TENTE NOVAMENTE");
            }
        }

        input.nextLine();
        do{
            numConta = JOptionPane.showInputDialog("Digite seu número de conta: ");

            if (numConta.length() == 6) {
                JOptionPane.showMessageDialog (null,"Numero valido");
                break;
            }
            else {
                JOptionPane.showMessageDialog (null, "DIGITE JUSTAMENTE 6 DIGITOS");
            }
        }while (true);

        System.out.println();
        String opcaod = "";
        while (opcaod == ""){
            opcaod = JOptionPane.showInputDialog("1 - Sim\n2 - Nao\nDeseja fazer algum deposito: ");

            switch (opcaod){
                case "1":
                    System.out.print("Quanto: ");
                    deposito = input.nextFloat();

                    saldo += deposito;

                    break;

                case "2":
                    saldo = 0;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }

        //Enum de tipo de conta
        System.out.println();
        TipoConta tipoConta = null;
        while (tipoConta == null){

            String opcaoc = JOptionPane.showInputDialog("1 - CORRENTE\n2 - POUPANCA\n3 - EMPRESARIAL\nQual o seu tipo de conta: ");

            switch (opcaoc){
                case "1":
                    tipoConta = TipoConta.CORRENTE;
                    break;

                case "2":
                    tipoConta = TipoConta.POUPANCA;
                    break;

                case "3":
                    tipoConta = TipoConta.EMPRESARIAL;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.TENTE NOVAMENTE");
            }
        }

        System.out.println();
        TipoMoeda tipoMoeda = null;
        while (tipoMoeda == null){
            String opcaom = JOptionPane.showInputDialog("1 - EURO\n2 - DOLAR\n3 - METICAL\nQual o tipo de moeda: ");

            switch (opcaom){
                case "1":
                    tipoMoeda = TipoMoeda.EURO;
                    break;

                case "2":
                    tipoMoeda = TipoMoeda.DOLAR;
                    break;

                case "3":
                    tipoMoeda = TipoMoeda.METICAL;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }

        System.out.println();
        Nacionalidade nacionalidade = null;
        while (nacionalidade == null){
            String opcaon = JOptionPane.showInputDialog("1 - ESTRANGERIRO\n2 - NACIONAL\nQual a sua nacionalidade: ");

            switch (opcaon){
                case "1":
                    nacionalidade = Nacionalidade.ESTRANGEIRO;
                    break;

                case "2":
                    nacionalidade = Nacionalidade.NACIONAL;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }

        Cliente cadaCliente = new Cliente(nome, genero, nacionalidade, numConta, tipoConta, tipoMoeda , saldo);
        listaClientes.add(cadaCliente);
    }

    public void mostrarClientes(){
        for (Cliente cadaCliente : listaClientes){
            System.out.println("Nome            : " + cadaCliente.getNome());
            System.out.println("Genero          : " + cadaCliente.getGenero());
            System.out.println("Nacionalidade   : " + cadaCliente.getNacionalidade());
            System.out.println("Numero de conta : " + cadaCliente.getNumCOnta());
            System.out.println("Tipo de conta   : " + cadaCliente.getTipoConta());
            System.out.println("Tipo de moeda   : " + cadaCliente.getTipoMoeda());
            System.out.println("Saldo           : " + cadaCliente.getSaldo());
            System.out.println("");
        }
    }

    public void gerarArquivoExcel(String nomeArquivo) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Clientes");

        // Criar o cabeçalho
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Nome");
        header.createCell(1).setCellValue("Gênero");
        header.createCell(2).setCellValue("Nacionalidade");
        header.createCell(3).setCellValue("Número da Conta");
        header.createCell(4).setCellValue("Tipo de Conta");
        header.createCell(5).setCellValue("Tipo de Moeda");
        header.createCell(6).setCellValue("Saldo");

        // Preencher as linhas com os dados dos clientes
        int rowNum = 1;
        for (Cliente cliente : listaClientes) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(cliente.getNome());
            row.createCell(1).setCellValue(cliente.getGenero().toString());
            row.createCell(2).setCellValue(cliente.getNacionalidade().toString());
            row.createCell(3).setCellValue(cliente.getNumCOnta());
            row.createCell(4).setCellValue(cliente.getTipoConta().toString());
            row.createCell(5).setCellValue(cliente.getTipoMoeda().toString());
            row.createCell(6).setCellValue(cliente.getSaldo());
        }

        // Salvar o arquivo
        try (FileOutputStream fileOut = new FileOutputStream(nomeArquivo + ".xlsx")) {
            workbook.write(fileOut);
            System.out.println("Arquivo Excel criado com sucesso: " + nomeArquivo + ".xlsx");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Carrega o arquivo existente
    public void carregarClientesDoExcel(String nomeArquivo) {
        File arquivo = new File(nomeArquivo + ".xlsx");
        if (!arquivo.exists()) {
            return; // Se não existe ainda, não há nada para carregar
        }

        try (FileInputStream fileIn = new FileInputStream(arquivo)) {
            Workbook workbook = new XSSFWorkbook(fileIn);
            Sheet sheet = workbook.getSheetAt(0);

            // Começar da linha 1 (ignorar cabeçalho)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    String nome = row.getCell(0).getStringCellValue();
                    Genero genero = Genero.valueOf(row.getCell(1).getStringCellValue());
                    Nacionalidade nacionalidade = Nacionalidade.valueOf(row.getCell(2).getStringCellValue());
                    String numConta = (String) row.getCell(3).getStringCellValue();
                    TipoConta tipoConta = TipoConta.valueOf(row.getCell(4).getStringCellValue());
                    TipoMoeda tipoMoeda = TipoMoeda.valueOf(row.getCell(5).getStringCellValue());
                    float saldo = (float) row.getCell(6).getNumericCellValue();

                    Cliente cliente = new Cliente(nome, genero, nacionalidade, numConta, tipoConta, tipoMoeda, saldo);
                    listaClientes.add(cliente);
                }
            }

            workbook.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo Excel: " + e.getMessage());
        }
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //levant
    public void levantarPorNumeroConta(List<Cliente> listaClientes, String numeroConta, float valor) {
        for (Cliente cliente : listaClientes) {
            float taxa = 0;
            if (cliente.getNumCOnta().equals(numeroConta)) {
                if (cliente.getSaldo() >= 100 && cliente.getSaldo() >= valor + 0.10) {
                    cliente.setSaldo(cliente.getSaldo() - valor - taxa);
                    System.out.println("Levantamento efetuado com sucesso!");
                }
                System.out.println("Saldo insuficiente para levantamento.");

                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    public void depositarPorNumeroConta(List<Cliente> listaClientes, String numeroConta, float valor) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getNumCOnta().trim().equals(numeroConta)) {
                cliente.setSaldo(cliente.getSaldo() + valor);
                System.out.println("DEPOSITO EFETUADO");
                return;
            }
            System.out.println("CONTA NAO ENCONTRADA");
        }
    }

    //Transf
    public void transferirEntreContas(List<Cliente> listaClientes, String contaOrigem, String contaDestino, float valor) {
        Cliente origem = null;
        Cliente destino = null;

        for (Cliente cliente : listaClientes) {
            if (cliente.getNumCOnta().equals(contaOrigem)) {
                origem = cliente;
            }
            if (cliente.getNumCOnta().equals(contaDestino)) {
                destino = cliente;
            }
        }

        if (origem == null || destino == null) {
            System.out.println("Conta de origem ou destino não encontrada.");
            return;
        }

        if (origem.getSaldo() >= valor) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            System.out.println("Transferência realizada com sucesso!");
        }
        System.out.println("Saldo insuficiente na conta de origem.");
    }

    public void contarClientesComMetical() {
        int contador = 0;

        for (Cliente cliente : listaClientes) {
            if (cliente.getTipoMoeda() == TipoMoeda.METICAL) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Nenhum cliente utiliza Metical.");
        } else {
            System.out.println("Quantidade de clientes que usam Metical: " + contador);
        }
    }

    public void mostrarFemininoComDolar() {
        boolean encontrou = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getGenero() == Genero.FEMENINO && cliente.getTipoMoeda() == TipoMoeda.DOLAR) {
                System.out.println("Nome: " + cliente.getNome());
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não encontrado.");
        }
    }
}