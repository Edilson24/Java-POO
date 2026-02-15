import java.util.Scanner;

public class Aula011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Escreva o seu nome completo: ");
        String nomeCompleto = input.next();

        System.out.println("Escreva o seu salario ");
        Double salario = input.nextDouble();

        System.out.println("Quanto é sua altura: ");
        float altura = input.nextFloat();

        System.out.println("Qual o seu genero [M/F]: ");
        //char genero = input.next().charAt(0);

        
    }
}
