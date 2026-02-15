package polimorfismo;
import entidades.Calculadora;
import entidades.Matematica;

import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Matematica matematica = new Matematica();

        calculadora.soma(10, 10);
        calculadora.soma(10, 10, 10);
        calculadora.soma(10, 10, 10, 10);

        System.out.println("-------------------------");
        matematica.soma(15, 10);
        matematica.soma(15, 10, 10);
        matematica.soma(13, 50, 10, 20);

    }
}
