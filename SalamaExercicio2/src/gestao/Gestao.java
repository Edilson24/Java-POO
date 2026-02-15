package gestao;

import entidades.Cliente;
import entidades.Pessoa;
import manipular.Manipular;

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manipular manipular = new Manipular();
        int quantidade;

        System.out.print("Quantos clientes deseja cadastrar: ");
        quantidade = input.nextInt();
        Cliente cliente[] = new Cliente[quantidade];

        //Registrar todos clientes
        manipular.registrar(cliente, quantidade);

        //Mostrar todos clientes
        System.out.println("Nomes dos clientes: ");
        manipular.nomestrar(cliente, quantidade);
        System.out.println("\n---------------------------");

        //Clientes com mais de 50.000 de saldo
        System.out.println("Nomes dos clientes com mais 50.000 de saldo:");
        manipular.maiorSaldo(cliente, quantidade);

    }
}
