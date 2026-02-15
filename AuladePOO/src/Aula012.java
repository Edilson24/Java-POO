import javax.xml.transform.Source;
import java.util.Scanner;

public class Aula012 {
    public static void main(String[] args) {
        // Calculo de média usandos todos operadores

        Scanner input = new Scanner(System.in);

        System.out.print("Escreve a sua média: ");
        Float media = input.nextFloat();

        if (media <= 9){
            System.out.println("Reprvado com " +media);
        }
        else if (media >= 10 && media <=15){
            System.out.println("Admitido com " +media);
        }
        else {
            System.out.println("Dispensado com "+media);
        }
    }
}
