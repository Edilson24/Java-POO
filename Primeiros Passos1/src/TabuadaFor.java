import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.printf("Digite um valor para ver sua tabuada: ");
        int a = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}
