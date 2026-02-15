package gestao;

import entidades.Cliente;
import manipular.Configuracoes;
import manipular.Controlador;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        List <Cliente> listaClientes = new ArrayList<>();

        Controlador controlador = new Controlador(listaClientes);
        Configuracoes configuracoes = new Configuracoes(listaClientes);

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("\n" +
                    "1 - Cadastrar\n" +
                    "2 - Depositar\n" +
                    "3 - Levantar\n" +
                    "4 - Transferir\n" +
                    "5 - Todos clientes\n" +
                    "6 - Clientes que usam metical\n" +
                    "7 - Configuracao de conta\n" +
                    "8 - Sair\n" +
                    "Que operacao deseja realizar: ");

            int opcao = input.nextInt();
            switch (opcao){
                case 1:
                    int esc;
                    do{
                        controlador.cadastrar();
                        System.out.println("1 - Sim\n2 - Nao\nDeseja fazer outro cadastro: ");
                        esc = input.nextInt();
                    }while (esc == 1);
                break;

                case 2:
                    controlador.depositar();
                break;

                case 3:
                    controlador.levantar();
                break;

                case 4:
                    controlador.transferir();
                break;

                case 5:
                    controlador.mostrarTodos();
                break;

                case 6:
                    controlador.clienteMetical();
                break;

                case 7:
                    int termino = 0;
                    while (termino != 7){
                        System.out.print("\n1 - Nome\n" +
                                         "2 - Genero\n" +
                                         "3 - Nacionalidade\n" +
                                         "4 - Numero de conta\n" +
                                         "5 - Tipo de conta\n" +
                                         "6 - Tipo de moeda\n" +
                                         "7 - Sair\n" +
                                "Qual a alteracao que deseja fazer: ");

                        int opcaoc = input.nextInt();

                        switch (opcaoc){
                            case 1:
                                configuracoes.confNome();
                            break;

                            case 2:
                                configuracoes.confGenero();
                            break;

                            case 3:
                                configuracoes.confNacionalidade();
                            break;

                            case 4:
                                configuracoes.confNumconta();
                            break;

                            case 5:
                                configuracoes.confTipoconta();
                            break;

                            case 6:
                                configuracoes.confTipomoeda();
                            break;

                            case 7:
                                termino = 7;
                            break;

                            default:
                                System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
                        }
                    }
                break;

                case 8:
                    System.out.println("OBRIGADO POR USAR O NOSSO \nSISTEMA! VOLTE SEMPRE.");
                    System.exit(0);
                break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }
    }
}