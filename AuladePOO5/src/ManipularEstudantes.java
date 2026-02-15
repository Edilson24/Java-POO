import java.util.Scanner;
import entiteis.Estudante;
//Autor: Edilson

public class ManipularEstudantes {
    public void main(Estudante estudante[], int quantidade) {
        String nomeEstudante;
        double notas1;
        double notas2;
        double notas3;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite seu nome completo: ");
            nomeEstudante = input.nextLine();
            estudante[i].setNome(nomeEstudante);

            System.out.println("Digite sua nota 1: ");
            notas1 = input.nextDouble();
            estudante[i].setNota1(notas1);

            System.out.println("Digite sua nota 2: ");
            notas2 = input.nextDouble();
            estudante[i].setNota2(notas2);

            System.out.println("Digite sua nota 3: ");
            notas3 = input.nextDouble();
            estudante[i].setNota3(notas3);
        }

        System.out.println("\n-----------------------------");
        
    public void mostrarEstudante(Estudante estudante[], int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Nome completo : %s", estudante[i].getNome());
            System.out.printf("Nota 1        : %d", estudante[i].getNota1());
            System.out.printf("Nota 2        : %d", estudante[i].getNota2());
            System.out.printf("nota 3        : %d", estudante[i].getNota3());
        }
    }
}
