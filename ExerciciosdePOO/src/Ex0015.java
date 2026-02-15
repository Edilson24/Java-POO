import java.util.Scanner;
//Edilson Vitorino Hilário
//5. Faça um Programa que converta metros para centímetros.

public class Ex0015 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;

        System.out.printf("Digite um valor em metros para vê-lo em centímetros: ");
        a = input.nextInt();

        System.out.printf(a + " metros, em centímetros fica " + a * 100);
    }
}
