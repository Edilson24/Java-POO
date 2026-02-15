import java.util.Scanner;

//Edilson Vitorino Hilario
//1. Faça um Programa que peça dois números e imprima o maior deles

public class Ex0021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Digite um valor a: ");
        a = input.nextInt();

        System.out.print("Digite o valor b: ");
        b = input.nextInt();

        System.out.printf("%d é maior", Math.max(a, b));
    }
}
