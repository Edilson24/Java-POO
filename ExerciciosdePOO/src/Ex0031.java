import java.util.Scanner;
//Edilson Vitorino Hilario
//1. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
// qualquer número inteiro entre 1 a 10. O usuário

public class Ex0031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, a;

        System.out.print("Digite um valor para ver sua tabuada: ");
        a = input.nextInt();

        while (i <= 10){
            System.out.printf("%d x %d = %d\n", a, i, a*i);

            i += 1;
        }
    }
}
