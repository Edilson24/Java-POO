package org.example.manipular;

import org.example.entidades.Estudante;
import java.util.Scanner;

public class Manipular {
    public void cadastrar(Estudante estudante[], int quantidade) {
        for (int i = 0; i < estudante.length; i++) {
            Scanner input = new Scanner(System.in);

            String nomeEstudade;
            float n1, n2, pagameIn = -1000;
            int anoNascimento;

            System.out.print("Qual o seu nome: ");
            nomeEstudade = input.nextLine();

            System.out.print("Em que ano foi nascido: ");
            anoNascimento = input.nextInt();

            System.out.print("Digite a nota 1: ");
            n1 = input.nextFloat();

            System.out.print("Digite a nota 2: ");
            n2 = input.nextFloat();

            //Chama metodo para fazer algum depósito inicial
            calculoDivida(estudante, quantidade);
            estudante[i] = new Estudante(nomeEstudade, anoNascimento, n1, n2, pagameIn);
            System.out.println("");
        }
    }

    //METODO PARA MOSTRAR DADOS
    public void mostrar(Estudante estudante[], int quantidade) {
        for (int i = 0; i < estudante.length; i++) {
            System.out.println("Nome    : " + estudante[i].getNome());
            System.out.println("Ano     : " + estudante[i].getAno());
            System.out.println("Nota 1  : " + estudante[i].getNota1());
            System.out.println("Nota 2  : " + estudante[i].getNota2());
            System.out.println("Media   : " + calculoMedia(estudante, quantidade));
            //System.out.println("Divida  : " + estudante[i].getPagInic();
            //System.out.println("Saldo  : " + calculoMedia(estudante, quantidade));
        }
    }

    //METODO PARA CALCULAR MEDIA
    float calculoMedia(Estudante estudante[], int quantidade) {
        float mediaEstudade = 0;
        for (int i = 0; i < estudante.length; i++) {
            mediaEstudade =(estudante[i].getNota1() + estudante[i].getNota2()) / 2;
        }
        return mediaEstudade;
    }

    //METODO PARA CALCULAR DIVIDA
    float calculoDivida(Estudante estudante[], int quantidade) {
        float dividaEstudade = -1000;

        int resp = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < estudante.length; i++) {


            while (resp == 0){
                System.out.println("1 - SIM\n2 - NAO\nDeseja fazer algum deposito:");
                resp = input.nextInt();

                switch (resp){
                    case 1:
                        System.out.println("Quanto deseja depositar: ");
                        float deposito = input.nextFloat();
                        //estudante[i].getPagInic() += deposito;
                    break;

                }
            }

            //dividaEstudade = ;
        }
        return dividaEstudade;
    }

}