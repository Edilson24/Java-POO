import java.util.Scanner;
public class Ex0019 {
/*
Edilson Vitorino hilario
9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme
e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
 */


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float C, F;

        System.out.print("Digite um valor em Fahrenheit: ");
        F = input.nextFloat();

        C = 5 * ((F-32) / 9);

        System.out.printf("E Celcius a temperatura fica %.1f graus", C);
        input.nextLine();

    }
}
