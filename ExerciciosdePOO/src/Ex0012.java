import java.util.Scanner;
// Edilson Vitorino Hilário
//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]

public class Ex0012 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;

        System.out.printf("Digite um valor: ");
        a = input.nextInt();

        System.out.printf("Voce Digitou: " + a);
    }
}