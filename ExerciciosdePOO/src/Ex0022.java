import java.util.Scanner;
//Edilson Vitorino Hilario
//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo

public class Ex0022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("Digite um valor qualquer: ");
        a = input.nextInt();

        if (a > 0){
            System.out.print("O valor digitado é positivo");
        }else System.out.print("O valor digitado é negativo");
    }
}
