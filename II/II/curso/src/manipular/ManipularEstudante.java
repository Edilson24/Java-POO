/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipular;

import entities.Estudante;
import java.util.Scanner;

/**
 *
 * @author mussa
 */
public class ManipularEstudante {

    public void cadastroEstudante(Estudante estudante[], int quantidade) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quantidade; i++) {
            estudante[i] = new Estudante();
            System.out.println("Nome completo: ");
            String nomeEstudante = input.nextLine();
            estudante[i].setNome(nomeEstudante);

            System.out.println("Nota 1: ");
            double notas1 = input.nextDouble();
            estudante[i].setNota1(notas1);

            System.out.println("Nota 2: ");
            double notas2 = input.nextDouble();
            estudante[i].setNota2(notas2);

            System.out.println("Nota 3: ");
            double notas3 = input.nextDouble();
            estudante[i].setNota3(notas3);
            input.nextLine();

        }

    }

    // B
    public double mediaEstudante(Estudante estudante) {
        return (estudante.getNota1() + estudante.getNota2() + estudante.getNota3()) / 3.0;

    }

    // C
    String nomeMelhor = "";
    double mediaMelhor = -1;

    public void MelhorEstudante(Estudante estudante[], int quantidade) {

        for (int i = 0; i < quantidade; i++) {
            double medias = mediaEstudante(estudante[i]);
            if (medias >= mediaMelhor) {
                mediaMelhor = medias;
                nomeMelhor = estudante[i].getNome();
            }
        }

    }

    //D
    public String situacao(Estudante estudante) {
        String aux;
        double medias = mediaEstudante(estudante);
        if (medias <= 5) {
            return "Reprovado!";
        } else if (medias >= 6 && medias <= 9.5) {
            return "Está em recuperacao";
        } else if (medias > 9.7 && medias <= 15.5) {
            return "Aprovado!";
        } else if (medias > 15.6 && medias <= 20) {
            return "Disp!";
        } else {
            return "invalido";
        }

    }

    //public void sit
    // A
    public void mostarEstudante(Estudante estudante[], int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            double medias = mediaEstudante(estudante[i]);
            String sit = situacao(estudante[i]);
            System.out.printf("Nome Completo: %s | Nota1: %.1f| Nota2: %.1f| Nota3: %.1f| Media: %.1f| Situacao: %s\n", estudante[i].getNome(), estudante[i].getNota1(), estudante[i].getNota2(), estudante[i].getNota3(), medias, sit);
        }

        System.out.println("Melhor estudante!");
        MelhorEstudante(estudante, quantidade);
        mostarMelhor();
    }

    public void mostarMelhor() {
        System.out.println("Nome do melhor estudante: " + nomeMelhor + "Media:" + mediaMelhor);
    }

}
