package org.example.gestao;

import org.example.entidades.Estudante;
import org.example.manipular.Manipular;
import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manipular manipular = new Manipular();

        System.out.print("Quantos deseja cadastrar: ");
        int quantidade = input.nextInt();
        Estudante estudante[] = new Estudante[quantidade];

        manipular.cadastrar(estudante, quantidade);
        manipular.mostrar(estudante, quantidade);


    }
}
