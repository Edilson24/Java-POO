import java.util.Scanner;
//Edilson Vitorino Hilario
//3. Faça um programa que leia um nome de usuário e
// a sua senha e não aceite a senha igual ao nome do usuário,

public class Ex0033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, senha = "";

        System.out.print("Digite o seu nome: ");
        nome = input.next();


        do{
            System.out.print("Insira uma senha: ");
            senha = input.next();

            if (nome.equals(senha)){
                System.out.println("Por favor deve digirar uma senha diferento nome o usuario: ");
            }
        }while (nome.equals(senha));

        System.out.print("Cadastrado com sucesso!");
    }
}
