package gestao;

import entidades.Estudante;
import manipular.Manipular;

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manipular manipular = new Manipular();
        int quantidade;

        System.out.print("Quantos estudantes deseja cadastrar: ");
        quantidade = input.nextInt();
        Estudante estudante[] = new Estudante[quantidade];

        while (true){
            System.out.print("\n1 - Cadastrar\n" +
                    "2 - Quantidade de estudantes que entraram antes de 2023\n" +
                    "3 - Estudante mais velho\n" +
                    "4 - Quantidade de estudantes masculinos de medicina geral\n" +
                    "5 - Mostrar estudante selecionado\n" +
                    "6 - Mostrar todos\n" +
                    "7 - sair\n" +
                    "Selecione a operacao que deseja realizar: ");

            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    manipular.cadastrar(estudante, quantidade);
                break;

                case 2:
                    manipular.quantEstudate(estudante, quantidade);
                break;

                case 3:
                    manipular.estudanteMaisvelho(estudante, quantidade);
                break;

                case 4:
                    manipular.geralMasculino(estudante, quantidade);
                break;

                case 5:
                    manipular.selecionado(estudante, quantidade);
                break;

                case 6:
                    manipular.todos(estudante, quantidade);
                break;

                case 7:
                    System.out.println("OBRIGADO POR USAR NOSSO SISTEMA");
                    System.exit(0);
                break;

                default:
                    System.out.println("OPCAO INVALIDA.TENTE NOVAMENTE");
            }
        }

    }
}
