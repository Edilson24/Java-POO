import java.util.Scanner;

//Edilson Vitorino Hilario
//3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M -
//Masculino, Sexo Inválido.

public class Ex0023 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char resp;

        System.out.print("F - Feminino \nM - Masculino \nQual o seu genero: ");

        resp = input.next().charAt(0);

        if (resp == 'F') {
            System.out.print("O genero escolhido foi Feminino");
        }
        else if (resp == 'M') {
            System.out.print("O genero escolhido foi Masculino");
        }else System.out.print("Resposta invalida");
    }
}
