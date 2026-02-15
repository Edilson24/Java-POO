import java.util.List;
import java.util.Scanner;
public class Lista1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <String> vogais = List.of("S", "C", "V", "D");
        String estadoCivil;
        do{
        System.out.print("S - Solteiro \nC - Casado \nV - " +
                "Viuvo \nD - Divorciado \nQual o seu estado sivil: ");
        estadoCivil = input.next().toUpperCase();

        if (!vogais.contains(estadoCivil)){
            System.out.println("----------------------------------------");
            System.out.println("Escolhe apenas com as vogais sugeridas");

            }
        }while (!vogais.contains(estadoCivil));
    }
}
