import java.io.PrintStream;
import java.util.Scanner;
//Edilson Vitorino Hilário
//3.  Faça um Programa que peça dois números e imprima a soma.

public class Ex0013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, soma;

        System.out.printf("Digitem o valor a: ");
        a = input.nextInt();

        System.out.printf("Digite o valor b: ");
        b = input.nextInt();

        soma = a + b;

        System.out.println("A soma entre " + a +" e " + b + " vale " + soma);
    }
}
