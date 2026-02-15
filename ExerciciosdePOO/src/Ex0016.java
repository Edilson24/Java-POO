import java.util.Scanner;
//Edilson Vitorino Hilário
// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

public class Ex0016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float raio;
        double area;
        final double pi;
        pi = 3.14;

        System.out.printf("Digite o raio do circulo: ");
        raio = input.nextFloat();

        area = pi * (raio * raio);
        System.out.printf("A área do circulo vale: %s metros quadrados", area);
    }
}
