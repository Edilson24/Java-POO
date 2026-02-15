import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char resp = 's';

        while (resp == 's'){


            System.out.printf("Qual o seu nome: ");
            String nomeCompleto = input.next();

            System.out.printf("Digite a nota 1: ");
            int nota1 = input.nextInt();

            System.out.printf("Digite a nota 2: ");
            int nota2 = input.nextInt();

            int media = (nota1 + nota2) / 2;

            if (media <= 9){
                System.out.println("Reprovado com: " +media);
            }
            else if (media >= 10 && media <= 15){
                System.out.println("Admitido com: " +media);
            }
            else{
                System.out.println("Dispensado com " +media);
            }

            System.out.println("-----------------------------");
            System.out.printf("Deseja Continuar? ");
            resp = input.next().charAt(0);
        }
    }
}
