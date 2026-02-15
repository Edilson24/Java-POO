import java.util.Scanner;

public class Aula013 {
    public static void main(String[] args) {
        //Estruturas de repetição
        Scanner input = new Scanner(System.in);
        char resp = 'S';


        while (resp == 'S'){
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

            System.out.println("----------------------------------------");

            System.out.printf("Deseja continuar? [S/N]: ");
            resp = input.next().charAt(0);
        }

    }
}
