import packaged.Produto;

import java.util.Scanner;

public class LojaProduto {
    public static void main(String[] args) {
        Produto produts = new Produto();
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        produts.nameProduto = input.nextLine();

        System.out.print("Preço:           ");
        produts.preco = input.nextDouble();

        System.out.print("Quantidade:      ");
        produts.quantidade = input.nextInt();

        System.out.println("-------------------------------------");

        System.out.println("Nome do produto: " + produts.nameProduto);
        System.out.println("Preço:           " + produts.preco);
        System.out.println("Quantidade:      " + produts.quantidade);

        System.out.print("Adicionar Quantidade: ");
        int quantidade = input.nextInt();
        produts.adicionar(quantidade);

        System.out.println("-----------------------");
        System.out.printf("adicionado! Passa a ser "+ produts);
        System.out.println("\n--------------------\n-----------------");


    }
}
