package gestao;

import Entidades.Funcionario;
import manipular.Manipular;

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        System.out.println(" QUANTOS ESTUDANTES PRETENDES CADASTRAR: ?");
        quantidade = input.nextInt();
        Manipular manipular = new Manipular();
        Funcionario funcionario[] = new Funcionario[quantidade];
        manipular.cadastrar(funcionario,quantidade);
        manipular.mostrarFeminino2023(funcionario,quantidade);
        manipular.QuantEstudioso(funcionario,quantidade);
        manipular.mostrarFuncionaMaisnovo(funcionario,quantidade);
    }
}
