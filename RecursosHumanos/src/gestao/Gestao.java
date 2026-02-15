package gestao;

import entidades.Funcionario;
import manipular.Manipular;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Funcionario> listaFuncionario = new ArrayList<>();
        Manipular manipular = new Manipular(listaFuncionario);

        while (true){
            System.out.print("1 - CADASTRAR\n" +
                    "2 - QUANTIDADE DE GENERO FEMENINO DE 2023\n" +
                    "3 - FUNCIONARIO MOCAMBICANO MAIS NOVO\n" +
                    "4 - QUANTIDADE DE ADVOGADOS DE GENERO MASCULINO\n" +
                    "5 - MOSTRAR TODOS\n" +
                    "6 - SAIR\n" +
                    "QUE OPERACAO DESEJA REALIZAR: ");

            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    manipular.cadastrar();
                    System.out.println("");
                break;

                case 2:
                    manipular.quantidadeFeminina();
                break;

                case 3:
                    manipular.funcionarioMaisnovo();
                break;

                case 4:
                    System.out.println("METODO EM DESENVOLVIMENTO");
                break;

                case 5:
                    manipular.mostrarTodos();
                break;

                case 6:
                    System.exit(0
                    );
                break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE!");
            }
        }
    }
}
