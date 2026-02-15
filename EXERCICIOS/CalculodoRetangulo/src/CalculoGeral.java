import java.util.Scanner;
import java.lang.Math;
import dadosdoretangulo.Calculo;

public class CalculoGeral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculo calc = new Calculo();

        System.out.print("Digite a altura: ");
        calc.altura = input.nextInt();

        System.out.print("Digite a largura: ");
        calc.base = input.nextFloat();

        System.out.println(calc);

    }
}
