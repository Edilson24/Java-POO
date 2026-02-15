package org.example.manipular;

import java.util.Scanner;

public class LaboratorioNumConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numConta = "";



        System.out.println();
        while (true){

            System.out.println("Digite seu número de conta: ");
            numConta = input.nextLine();

            if (numConta.length() == 6) {
                System.out.println("Numero valido");
                break;
            }
            else{
                System.out.println("Numero invalido");
            }
        }


        System.out.println(numConta);
    }
}
