package gestao;

import entidades.Candidato;
import manipular.Manipular;
/*
* Alves Lemos Antonio Arthur
* Alberto Francisco Junjo
* Donaire Sónia de Oliveira
* Edgar Remígio Manuel
* Edilson Vitorino Hilário
* Manuel Zeferino Penga
* Renildo Cândido
* Robson Aly Muadica
* */

import java.util.Scanner;

public class Gestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manipular manipular = new Manipular();
        int quantidade;

        System.out.print("Quantos candidados deseja cadastrar: ");
        quantidade = input.nextInt();

        Candidato candidato[] = new Candidato[quantidade];

        manipular.cadastrar(candidato, quantidade);
        System.out.println("----------------------------------");
        System.out.println("Moçambicanos e sua especialidade: ");
        manipular.mocambicanos(candidato, quantidade);

        System.out.println("----------------------------------");
        System.out.println("Os que se candidataram as vagas de Java e Dart:");
        manipular.javaedart(candidato, quantidade);

        System.out.println("----------------------------------");
        System.out.println("Sul Africanas que program em Python:");
        manipular.femeninoaficadosulpython(candidato, quantidade);

        System.out.println("----------------------------------");
        System.out.println("Quantidade de programadores em Botswana: ");
        manipular.botswanamaculino(candidato, quantidade);
    }
}
