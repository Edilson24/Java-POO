import java.util.Scanner;
import entities.Estudante;

public class ControledeEstudante {
    public void cadastroEstudante(Estudante estudante[], int quantidade){
        Scanner input = new Scanner(System.in);
        String nomeCompleto;
        double nota1, nota2, nota3

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome Completo: ");
            nomeCompleto = input.nextLine();
            estudante[i].setNome();

            System.out.println("Digite nota 1: ");
            nota1 = input.nextDouble();
            estudante[i].setNota1();

            System.out.println("Digite nota 2: ");
            nota2 = input.nextDouble();
            estudante[i].setNota2();

            System.out.println("Digite nota 3: ");
            nota3 = input.nextDouble();
            estudante[i].setNota3();



        }
    }
}
