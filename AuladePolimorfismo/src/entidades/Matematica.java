package entidades;
import entidades.Calculadora;

public class Matematica extends Calculadora{

    public void soma(int a, int b){
        int somar = a + b;
        System.out.println("Soma: " + somar);
    }

    public void soma(int a, int b, int c){
        int somar = a + b + c;
        System.out.println("Soma: " + somar);
    }

    public void soma(int a, int b, int c, int d) {
        int somar = a + b + c + d;
        System.out.println("Soma: " + somar);
    }
}
