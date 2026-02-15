package gestao;

//Edilson Vitorino Hilario
import entidades.Cliente;
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

        //Cadastrar todos clientes
        manipular.cadastrar(cliente, quantidade);

        //Depositar valores
        manipular.deposito(cliente, quantidade);

        //Levantar valores
        manipular.levantar(cliente, quantidade);

        //Quantidade de clientes que utilizam moeda nacional
        manipular.moedanacional(cliente, quantidade);

    }
}
