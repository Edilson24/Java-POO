package gestao;


import endereco.Endereco;
import entidades.Cliente;

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente();
        String nome;
        int valor, local;

        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();
        cliente.setNome(nome);

        System.out.print("Quanto tem  de daldo na conta: ");
        valor = input.nextInt();
        cliente.setSaldo(valor);

        Endereco endereco = null;

        while (endereco == null){
            System.out.print("1 - MAPUTO\n2 - BEIRA\n3 - NAMPULA\nA - PEMBA\nEm qual das provincias vives: ");
            local = input.nextInt();

            switch (local){
                case 1:
                    endereco = Endereco.MAPUTO;
                    System.out.println(endereco);
                break;

                case 2:
                    endereco = Endereco.BEIRA;
                    System.out.println(endereco);
                break;

                case 3:
                    endereco = Endereco.NAMPULA;
                    System.out.println(endereco);
                break;

                case 4:
                    endereco = Endereco.PEMBA;
                    System.out.println(endereco);
                break;

                default:
                    System.out.println("Opção Invalida. Tente novamente");
                break;
            }


        }


        System.out.println("\n------------------------");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getSaldo());
        System.out.println(cliente.getEndereco());







    }
}

