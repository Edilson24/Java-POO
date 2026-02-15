import java.util.List;
import java.util.Scanner;

/*
Edilson Vitorino Hilario
//4. Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
 Estado Civil: 's', 'c', 'v', 'd'*/

public class Ex0034 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade, salario,cr;
        char resp;
        String estadoCivil;
        List <String> opc = List.of("S", "C", "V", "D");

        //A validar o nome
        do{
            System.out.print("Qual é o seu nome: ");
            nome = input.nextLine();
            cr = nome.length();

            if (cr <= 3) {
                System.out.println("Digite um nome com mais de 3 carateres: ");
            }
        }while (cr <= 3);

        System.out.println("----------------------------");

        //Validando a idade
        do{
            System.out.print("Quantos anos vc tem: ");
            idade = input.nextInt();

            if(idade > 150){
                System.out.println("So se pode cadastrar quem tiver ate 150 anos");
            }
        }while (idade > 150);

        System.out.println("----------------------------");

        //Validar a renda
        do{
            System.out.print("Quanto vc recebe de salario: ");
            salario = input.nextInt();

            if(salario <= 0){
                System.out.println("Escreva um valor maior que 0 ");
            }
        }while (salario <= 0);

        System.out.println("----------------------------");

        //Validando genero
        do{
            System.out.print("F - Feminino \nM - Masculino \nQual o seu genero: ");
            resp = input.next().toUpperCase().charAt(0);

            if (resp != 'F' && resp != 'M'){
                System.out.println ("Resposta invalida. Digite F ou M");
                System.out.println("--------------------");
            }
        }while (resp != 'F' && resp != 'M');

    System.out.println("--------------------------------");

        //Verificando o estado civil
        do{
            System.out.print("""
                    S - Solteiro\s
                    C - Casado\s
                    V - Viuvo\s
                    D - Divorciado\s
                    Qual o seu estado civil:\s""");
            estadoCivil = input.next().toUpperCase();

            if (!opc.contains(estadoCivil)){
                System.out.println("----------------------------------------");
                System.out.println("Escolhe apenas uma daso opções sugeridas");

            }
        }while (!opc.contains(estadoCivil));

        switch (estadoCivil){
            case "S":
                estadoCivil = "Solteiro";
                break;
            case "C":
                estadoCivil = "Casado";
                break;
            case "V":
                estadoCivil = "Viuvo";
                break;
            case "D":
                estadoCivil = "Divorciado";
                break;
            default:
                System.out.print(' ');
        }
    System.out.println("--------------------------------");
    System.out.println("Nome         :" + nome);
    System.out.println("Idade        :" + idade);
    System.out.println("Renda        :" + salario);
    System.out.println("Genero       :" + resp);
    System.out.println("Estado Civil :" + estadoCivil);
    System.out.println("--------------------------------");
    }
}