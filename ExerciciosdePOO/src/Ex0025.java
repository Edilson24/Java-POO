import java.util.Scanner;
/*
Edilson Vitorino Hilario
5. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez*/

public class Ex0025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2;
        float media;

        System.out.print("Digite a nota 1: ");
        nota1 = input.nextInt();

        System.out.print("Digite a nota 2: ");
        nota2 = input.nextInt();

        media = (nota1 + nota2)/2;

        if (media < 7){
            System.out.printf("Reprovado com %.1f", media);
        }
        else if (media >= 7 && media <= 9) {
            System.out.printf("Aprovado com %.1f", media);
        }
        if (media == 10) {
            System.out.printf("Aprovado com Distinção com %.1f", media);
        }
    }

}
