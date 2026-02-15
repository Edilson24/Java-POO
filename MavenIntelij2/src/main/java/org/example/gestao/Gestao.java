package org.example.gestao;

import org.example.manipular.Manipular;
import javax.swing.*;
import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Manipular manipular = new Manipular();


        int tentaticas = 0;
        String usuario = "", senha = "", resp = "";

        while (tentaticas < 3){

            usuario = JOptionPane.showInputDialog("Chave de administrador : ");


            senha = JOptionPane.showInputDialog("Senha de administrador : ");

            if (usuario.equals("edilson") && senha.equals("admin")) {
                JOptionPane.showMessageDialog(null, "ACESSO CONCEDIDO");
            break;
            }

            else {

                JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
                tentaticas ++;
            }
        }

            if (tentaticas <4 && usuario.equals("edilson") && senha.equals("admin")){
                while (true){




                    String opcao = JOptionPane.showInputDialog(
                            "1 - Cadastrar novo cliente\n" +
                                    "2 - Depositar\n" +
                                    "3 - Levantar\n" +
                                    "4 - Transferir\n" +
                                    "5 - Usuários do Metical\n" +
                                    "6 - Mulheres do Dólar\n" +
                                    "7 - Sair\n" +
                                    "Qual operação deseja realizar?"
                    );


                    switch (opcao) {
                        case "1":
                            do{
                                //Metodo para cadastrar
                                manipular.CadastrarCliente();

                                resp = JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO [s/n]");

                            }while (!resp.equals("n"));

                            manipular.carregarClientesDoExcel("Resgistro_Clientes");

                            manipular.gerarArquivoExcel("Resgistro_Clientes");


                            //Metodo para mostrar
                            manipular.mostrarClientes();

                        break;

                        case "2":
                            input.nextLine();
                            //DEPOSITO
                            System.out.println("Número da conta para depósito: ");
                            String contaDep = input.nextLine().trim();
                            System.out.print("Valor a depositar: ");
                            float valorDep = input.nextFloat();
                            manipular.depositarPorNumeroConta(manipular.getListaClientes(), contaDep, valorDep);
                        break;

                        case "3":
                            input.nextLine();
                            System.out.println();
                            String contaLev = JOptionPane.showInputDialog("Número da conta para levantamento: ");
                            float valorLev = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor a levantar"));
                            manipular.levantarPorNumeroConta(manipular.getListaClientes(), contaLev, valorLev);
                        break;

                        case "4":
                            input.nextLine(); // Limpa buffer
                            System.out.println("Número da conta origem: ");
                            String contaOrigem = input.nextLine();
                            System.out.println("Número da conta destino: ");
                            String contaDestino = input.nextLine();
                            System.out.print("Valor a transferir: ");
                            float valor = input.nextFloat();

                            manipular.transferirEntreContas(manipular.getListaClientes() ,contaOrigem, contaDestino, valor);

                        break;

                        case "7":
                            //SAIR
                            JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR NOSSOS SERVICOS");
                            System.exit(0);

                        break;


                        default:
                            JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.TENTE NOVAMENTE");
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "EXCEDEU O NUMERO DE TENTATIVAS");
            }


    }
}