import java.util.Scanner;
//Edilson Vitorino Hilario
//2. Faça um programa que peça uma nota, entre zero e dez.
//Mostre uma mensagem caso o valor seja inválido e continue

public class Ex0032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        do {
            System.out.print("Digite um valor de zero a dez: ");
            a = input.nextInt();
        } while (!(a >= 0 && a <=10));


    }
}
