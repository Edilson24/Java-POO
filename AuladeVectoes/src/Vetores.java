import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidade, i;

        System.out.print("Defina o tamanho do vetor: ");
        quantidade = input.nextInt();

        double[] notas = new double[quantidade];

        System.out.println("\n---------------------------------");

        for (i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota do estudante: ");
            notas[i] = input.nextInt();
        }

        for (i = 0; i < quantidade; i++) {
            System.out.printf("\nNota %d = %.1f", i, notas[i]);
        }
    }
}
