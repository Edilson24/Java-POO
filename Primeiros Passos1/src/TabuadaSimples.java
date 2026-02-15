import java.util.Scanner;

public class TabuadaSimples {
    public static void main(String[] args) {
        //Vamos calcular a Tabuada sem utilizar nenhuma estrutura de repetição
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um valor para ver sua tabuada: ");
        int a = input.nextInt();

        System.out.println(a + " x 1 = "+ a*1);
        System.out.println(a + " x 2 = "+ a*2);
        System.out.println(a + " x 3 = "+ a*3);
        System.out.println(a + " x 4 = "+ a*4);
        System.out.println(a + " x 5 = "+ a*5);
        System.out.println(a + " x 6 = "+ a*6);
        System.out.println(a + " x 7 = "+ a*7);
        System.out.println(a + " x 8 = "+ a*8);
        System.out.println(a + " x 9 = "+ a*9);
        System.out.println(a + " x 10 = "+ a*10);
    }
}
