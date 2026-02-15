import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        int idade = 20;
        char genero = 'M';
        String nomeCompleto = "Edilson Vitorino Hilario";
        float altura = 1.7f;
        double salario = 50.000;

        Scanner input = new Scanner(System.in);
        System.out.println("DADOS: ");
        System.out.println("Nome completo: " +nomeCompleto);
        System.out.println("Genero: " +genero);
        System.out.println("Idade: " +idade);
        System.out.println("Mede " +altura+ " de altura");
        System.out.println("Renda: " +salario);
    }
}
