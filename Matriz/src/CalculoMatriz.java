import java.util.Scanner;

public class CalculoMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = 0, c = 0;

        System.out.print("Quantas linhas  : ");
        l = input.nextInt();

        System.out.print("Quantas colunas : ");
        c = input.nextInt();

        int [][] matriz = new int[l][c];

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.println("Matriz ["+ i +"] [" + j + "]");
                matriz[i] [j] = input.nextInt();
            }
        }

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.println(matriz[i][j] + "\t");

            }
        }

    }
}
