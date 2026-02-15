import java.util.Scanner;
//Edilson Vitorino Hilário
// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class Ex0017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int altura, largura, area;

        System.out.printf("Digite o valor da altura: ");
        altura = input.nextInt();

        System.out.printf("Digite o valr da largura: ");
        largura = input.nextInt();

        area = altura * largura;

        System.out.printf("A área vale %d, e seu dobro vale %d metros quadrados", area, area*2);
    }
}
