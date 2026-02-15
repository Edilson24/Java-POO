import java.util.List;
import java.util.Scanner;
//Edilson Vitorino Hilario
//4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante

public class Ex0024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <String> vogais = List.of("A", "E", "I", "O", "U");
        String resp;

        System.out.print("Digite uma letra: ");
        resp = input.next().toUpperCase();

        if (vogais.contains(resp)) {
            System.out.println("Voce digitou uma vogal");

        } else System.out.print("Voce digitou uma consoante");



    }

}
