import java.util.Scanner;
import dadosde.DadosFuncionario;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DadosFuncionario dados = new DadosFuncionario();

        System.out.print("Digite o seu nome: ");
        dados.nome = input.nextLine();

        System.out.print("Quanto vc recebe: ");
        dados.salario = input.nextFloat();

        System.out.print("Quanto é seu imposto:");
        dados.imposto = input.nextFloat();

        System.out.println("\n-----------------------------");
        System.out.println(dados);

        System.out.println("\n-----------------------------");

        System.out.print("Quanto sera aumentado no seu salario: ");
        int salario = input.nextInt();
        dados.aumento(salario);

        System.out.println("\n-----------------------------");
        System.out.println(dados);
    }
}
