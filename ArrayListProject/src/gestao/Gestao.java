package gestao;

import manipular.Manipular;

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Manipular manipular = new Manipular();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("1 - Cadastrar\n" +
                    "2 - Depositar\n" +
                    "3 - Levantar\n" +
                    "4 - Numero de clientes que usam meticar\n" +
                    "5 - Mostrar todos\n" +
                    "6 - Sair\n" +
                    "Qual das operacoes deseja executar: ");

            int opcao = input.nextInt();
            switch (opcao){
                case 1:
                    manipular.cadastrar();
                    System.out.println("");
                break;

                case 2:
                    manipular.depositar();
                    System.out.println("");
                break;

                case 3:
                    System.out.println("Metodo em desenvolvimento");
                break;

                case 4:
                    System.out.println("Metodo em desenvolvimento");
                    break;

                case 5:
                    manipular.mostrar();
                    break;

                case 6:
                    System.out.println("PROGRAMA TERMINADO");
                    System.exit(0);
                    break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }
    }
}
