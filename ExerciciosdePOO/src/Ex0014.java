import java.util.Scanner;
//Edilson Vitorino Hilário
//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Ex0014 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int nota1, nota2, nota3, nota4;
    float media;

    System.out.printf("Digite a nota 1: ");
    nota1 = input.nextInt();

    System.out.printf("Digite a nota 2: ");
    nota2 = input.nextInt();

    System.out.printf("Digite a nota 3: ");
    nota3 = input.nextInt();

    System.out.printf("Digite a nota 4: ");
    nota4 = input.nextInt();

    media = (nota1 + nota2 + nota3 + nota4)/4;

    System.out.printf("A media vale: " + media);
    }
}
