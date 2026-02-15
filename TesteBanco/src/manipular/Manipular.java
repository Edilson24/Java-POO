package manipular;
//Edilson Vitorino Hilario

import entidades.Cliente;
import enums.Genero;
import enums.Moeda;
import enums.Nacionalidade;
import enums.TipoConta;

import java.util.Scanner;

public class Manipular {

    //a) CADASTRAR TODOS CLIENTES DO BANCO
    public void cadastrar(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            Scanner input = new Scanner(System.in);
            String nomeCliente;
            int opcaog, opcaot, opcaom, opcaon, numCont, saldoCliente;


            System.out.print("Digite o seu nome: ");
            nomeCliente = input.nextLine();

            System.out.println();
            Genero genero = null;
            while (genero == null){
                System.out.print("1 - MASCULINO\n2 - FEMENINO\nQual o seu genero: ");
                opcaog = input.nextInt();

                switch (opcaog){
                    case 1:
                        genero = Genero.MASCULINO;
                    break;

                    case 2:
                        genero = Genero.MASCULINO;
                    break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente: ");
                }
            }

            System.out.println();
            Nacionalidade nacionalidade = null;
            while (nacionalidade == null){
                System.out.print("1 - NACIONAL\n2 - ESTRANGENIRO\nQual a sua nacionalidade: ");
                opcaon = input.nextInt();

                switch (opcaon){
                    case 1:
                        nacionalidade = Nacionalidade.NACIONAL;
                    break;

                    case 2:
                        nacionalidade = Nacionalidade.ESTRANGEIRO;
                    break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente: ");
                }
            }

            System.out.println();
            System.out.print("Digite o seu numero de conta: ");
            numCont = input.nextInt();

            System.out.println();
            System.out.print("Quanto de saldo: ");
            saldoCliente = input.nextInt();

            System.out.println();
            TipoConta tipoConta = null;
            while (tipoConta == null){
                System.out.print("1 - CORREMTE\n2 - POUPANCA\n3 - EMPRESARIAL\nQual o seu tipo de conta: ");
                opcaot = input.nextInt();

                switch (opcaot){
                    case 1:
                        tipoConta = TipoConta.CORRENTE;
                    break;

                    case 2:
                        tipoConta = TipoConta.POUPANCA;
                    break;

                    case 3:
                        tipoConta = TipoConta.EMPRESARIAL;
                    break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente: ");
                }
            }

            System.out.println();
            Moeda moeda = null;
            while (moeda == null){
                System.out.print("1 - METICAL\n2 - DOLAR\n3 - EURO\nQual o seu tipo de conta: ");
                opcaom = input.nextInt();

                switch (opcaom){
                    case 1:
                        moeda = Moeda.METICAL;
                    break;

                    case 2:
                        moeda = Moeda.DOLAR;
                    break;

                    case 3:
                        moeda = Moeda.EURO;
                    break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente: ");
                }
            }

            cliente[i] = new Cliente(nomeCliente, genero, nacionalidade, numCont, saldoCliente, tipoConta, moeda);
            System.out.println("----------------------------------------------------");
        }

    }

    //b) DEPOSITAR VALOR
    public void deposito(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            Scanner input = new Scanner(System.in);
            float depos = 0;

            System.out.println("Deposite para o cliente numero " + i + " :");
            depos = input.nextInt();
            depos += cliente[i].getSaldo() ;


            System.out.println("Cliente passa a ter: "+ depos);
        }

    }

    //c) LEVANTAR VALOR
    public void levantar(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            float levant = 0;

            System.out.println("Levante valor do cliente " + i);
            levant = (float) (levant - cliente[i].getSaldo() - 0.5);
            System.out.println("O cliente passa a ter: " + levant);

        }

    }

    //d) QUANTIDADE DE CLIENTES NACIONAIS
    public void moedanacional(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            if (cliente[i].getMoeda() == Moeda.METICAL){
                System.out.println("Nome: " + cliente[i].getNome());
                System.out.println("---------------------------------");

            }

        }

    }


}
