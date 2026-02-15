package manipular;

import entidades.Cliente;
import entidades.Pessoa;
import enums.Nacionalidade;

import java.util.Scanner;

public class Manipular {
    public void registrar(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            Scanner input = new Scanner(System.in);

            String nomeCliente;
            int idadeCliente, numCliente, opcao, nuitClente;
            float saldoCliente;

            System.out.println();
            System.out.print("Digite o seu nome: ");
            nomeCliente = input.nextLine();

            System.out.println();
            System.out.print("Qual a sua idade: ");
            idadeCliente = input.nextInt();

            System.out.println();
            Nacionalidade nacionalidade = null;
            while (nacionalidade == null){
                System.out.print("1 - NACIONAL\n2 - ESTRANGEIRO\nQual a sua nacionalidade: ");
                opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        nacionalidade = Nacionalidade.NACIONAL;
                    break;

                    case 2:
                        nacionalidade = Nacionalidade.ESTRANGEIRO;
                    break;

                    default:
                        System.out.println("Opcao Invalida. Tente novamente");
                }
            }

            System.out.println();
            System.out.print("Quanto é seu saldo: ");
            saldoCliente = input.nextInt();

            System.out.println();
            System.out.print("Qual o seu Nuit: ");
            nuitClente = input.nextInt();

            System.out.println();
            System.out.print("Digite o seu numero de conta: ");
            numCliente = input.nextInt();


            input.nextLine();
            cliente[i] = new Cliente(nomeCliente, idadeCliente, nacionalidade, saldoCliente, nuitClente, numCliente);
            System.out.println("-----------------------------------");
        }
    }

    public void nomestrar(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
            System.out.println(cliente[i].getTitular());
        }
    }

    //Clientes com saldo acima de 50.000 de saldo
    public int maiorSaldo(Cliente cliente[], int quantidade){
        for (int i = 0; i < cliente.length; i++){
                System.out.println("Seu saldo: " + cliente[i].getSaldo());
        }
        return quantidade;
    }
}
