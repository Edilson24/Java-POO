import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int i = 1;
        int a;

        System.out.printf("Digite um valor para ver sua tabuada: ");
        a = input.nextInt();

        while (i <= 10){
            System.out.println(a + " x " + i + " = " + a * i);
            i = i + 1;

        }
    }
}
