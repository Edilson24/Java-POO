import entities.Dados;
import java.util.Scanner;

//Autor: Edilson Vitorino Hilario
public class Gestao {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Dados inf = new Dados();
        Dados inf2 = new Dados();
        String nome;
        float nota1, nota2, nota3, media;


        //Nome do estudante 1
        System.out.println("Cadastrando o primeiro estudande");
        System.out.print("Digite o seu nome: ");
        nome = input.nextLine().toUpperCase();
        inf.setNome(nome);


        //Nota 1
        System.out.print("Digite a sua nota 1: ");
        nota1 = input.nextFloat();
        inf.setNota1(nota1);


        //Nota 2
        System.out.print("Digite a sua nota 2: ");
        nota2 = input.nextFloat();
        inf.setNota2(nota2);

        //Nota 3
        System.out.print("Digite a sua nota 3: ");
        nota3 = input.nextFloat();
        inf.setNota3(nota3);

        System.out.println("\n----------------------------------------");

        //Estudante 2
        System.out.println("Cadastrando o segundo estudante");
        System.out.print("Digite o seu nome: ");
        nome = input.next().toUpperCase();
        inf2.setNome(nome);

        //Nota 1
        System.out.print("Digite a sua nota 1: ");
        nota1 = input.nextFloat();
        inf2.setNota1(nota1);


        //Nota 2
        System.out.print("Digite a sua nota 2: ");
        nota2 = input.nextFloat();
        inf2.setNota2(nota2);

        //Nota 3
        System.out.print("Digite a sua nota 3: ");
        nota3 = input.nextFloat();
        inf2.setNota3(nota3);

        System.out.println("----------------------------------------");
        System.out.println("Primeiro Estudante");
        System.out.println("Nome do estudante  : " + inf.getNome());
        System.out.println("Nota 1             : " + inf.getNota1());
        System.out.println("Nota 2             : " + inf.getNota2());
        System.out.println("Nota 3             : " + inf.getNota3());
        System.out.printf("Media              : %.2f", inf.getMedia());


        System.out.println("\n----------------------------------------");
        System.out.println("Segundo Estudante");
        System.out.println("Nome do estudante  : " + inf2.getNome());
        System.out.println("Nota 1             : " + inf2.getNota1());
        System.out.println("Nota 2             : " + inf2.getNota2());
        System.out.println("Nota 3             : " + inf2.getNota3());
        System.out.printf("Media              : %.2f", inf2.getMedia());
        System.out.println("\n----------------------------------------");

        if (inf.getMedia() > inf2.getMedia()) {
            System.out.printf("\nO estudante %s tem uma média maior que %s.%n", inf.getNome(), inf2.getNome());
        } else if (inf2.getMedia() > inf.getMedia()) {
            System.out.printf("\nO estudante %s tem uma média maior que %s.%n", inf2.getNome(), inf.getNome());
        } else {
            System.out.println("\nOs dois estudantes têm a mesma média.");
        }
    }
}
