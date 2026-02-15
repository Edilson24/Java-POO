package manipular;

import entidades.Estudante;
import enums.Curso;
import enums.Genero;
import java.util.Scanner;

public class Manipular {
    public void cadastrar(Estudante estudante[], int quantidade){
        for (int i = 0; i < estudante.length; i++) {
            Scanner input = new Scanner(System.in);
            String nomeEstudante, numeroEstudante;
            int idadeEstudante, dataEstudante;

            System.out.println("-------------------------------------");
            System.out.println("CADASTRANDO ESTUDANTE NUMERO : " + (i+1));
            System.out.println("-------------------------------------");

            System.out.print("\nDigite o seu nome completo: ");
            nomeEstudante = input.nextLine().trim();

            System.out.print("Digite sua idade: ");
            idadeEstudante = input.nextInt();

            Genero genero = null;
            while (genero == null){
                System.out.print("\n1 - MASCULINO\n2 - FEMININO\nSeleciona o seu genero: ");
                int opcaog = input.nextInt();

                switch (opcaog){
                    case 1:
                        genero = Genero.MASCULINO;
                    break;

                    case 2:
                        genero = Genero.FEMININO;
                    break;

                    default:
                        System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
                }
            }

            input.nextLine();

            while (true){
                System.out.print("\nDigite seu numero de estudante: ");
                numeroEstudante = input.nextLine().trim();

                if (numeroEstudante.length() != 6){
                    System.out.println("NUMERO INVALIDO. PERMITIDO \nAPENAS SEIS DIGITOS");
                }else {
                    break;
                }
            }

            System.out.print("Em que ano entrou na faculdade: ");
            dataEstudante = input.nextInt();

            Curso curso = null;
            while (curso == null){
                System.out.print("\n1 - GESTAO_DE_EMPRESAS\n" +
                        "2 - ENGENHARIA_DE_COMPUTACAO,\n" +
                        "3 - ENGENHARIA_METALURGICA,\n" +
                        "4 - MEDICINA_GERAL,\n" +
                        "5 - MEDICINA_DENTARIA\n" +
                        "Selecione o curso que frequenta: ");

                int opcaoc = input.nextInt();
                switch (opcaoc){
                    case 1:
                        curso = Curso.GESTAO_DE_EMPRESAS;
                    break;

                    case 2:
                        curso = Curso.ENGENHARIA_DE_COMPUTACAO;
                    break;

                    case 3:
                        curso = Curso.ENGENHARIA_METALURGICA;
                    break;

                    case 4:
                        curso = Curso.MEDICINA_GERAL;
                    break;

                    case 5:
                        curso = Curso.MEDICINA_DENTARIA;
                    break;

                    default:
                        System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE\n");
                }
            }

            estudante[i] = new Estudante(nomeEstudante, genero, idadeEstudante, numeroEstudante, dataEstudante, curso);
        }
    }

    //QUANTIDADE DE ESTUDANTES QUE ENTRARAM ANTES DE 2023
    public int quantEstudate(Estudante estudante[], int quantidade){
        int numero=0;
        System.out.println("\nQUANTIDADE DE ESTUDANTES QUE ENTRARAM ANTES DE 2023 : ");
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i].getGenero() == Genero.MASCULINO && estudante[i].getData() < 2023){
                System.out.println(estudante[i].getNome());
                numero++;
            }
        }
        return numero;
    }

    //ESTUDANTE MAIS VELHO
    public void estudanteMaisvelho(Estudante estudante[], int quantidade){
        System.out.println("ESTUDANTES MAIS VELHOS");
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i].getIdade() >= 18){
                System.out.println("NOME   : " + estudante[i].getNome());
                System.out.println("IDADE  : " + estudante[i].getIdade());
                System.out.println("NUMERO : " + estudante[i].getNumero());
                System.out.println("GENERO : " + estudante[i].getGenero());
                System.out.println("CURSO  : " + estudante[i].getGenero());
            }
        }
    }

    //QUANTIDADE MEDICINA GERAL DO GENERO MASCULINO
    public int geralMasculino(Estudante estudante[], int quantidade){
        int quantidad = 0;
        System.out.println("QUANTIDADE DE ESTUDANTES MASCULINOS DE MEDICINA GERAL");
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i].getGenero() == Genero.MASCULINO && estudante[i].getCurso() == Curso.MEDICINA_GERAL){
                System.out.println("NOME : " + estudante[i].getNome());
                quantidad ++;
            }
        }
        return quantidad;
    }

    //ESTUDANTE SELECIONADO
    public void selecionado(Estudante estudante[], int quantidade){
        Scanner input = new Scanner(System.in);
        boolean estEncontrado = false;
        String nomeEstudante, numeroEstudante;

        while (true){
            System.out.print("\n1 - Nome\n" +
                    "2 - Numero de conta\n" +
                    "Selecione o meio pelo qual deseja encontrar o estudande: ");
            int opcaose = input.nextInt();

            input.nextLine();
            switch (opcaose){
                case 1:
                    System.out.println("\nEscreva o nome do estudante que deseja encontrar:");
                    nomeEstudante = input.nextLine().trim();

                    for (int i = 0; i < estudante.length; i++) {
                        if (estudante[i].getNome().equals(nomeEstudante)){
                            System.out.println("NOME    : " + estudante[i].getNome());
                            System.out.println("IDADE   : " + estudante[i].getIdade());
                            System.out.println("NUMERO  : " + estudante[i].getNumero());
                            System.out.println("CURSO   : " + estudante[i].getCurso());
                            System.out.println("GENERO  : " + estudante[i].getGenero());
                            estEncontrado = true;
                            break;
                        }
                    }
                    if (!estEncontrado){
                        System.out.println("NOME NAO ENCONTRADO");
                    }
                break;

                case 2:
                    System.out.println("\nEscreva o numero do estudante que deseja encontrar:");
                    numeroEstudante = input.nextLine().trim();

                    for (int i = 0; i < estudante.length; i++) {
                        if (estudante[i].getNumero().equals(numeroEstudante)){
                            System.out.println("NOME    : " + estudante[i].getNome());
                            System.out.println("IDADE   : " + estudante[i].getIdade());
                            System.out.println("NUMERO  : " + estudante[i].getNumero());
                            System.out.println("CURSO   : " + estudante[i].getCurso());
                            System.out.println("GENERO  : " + estudante[i].getGenero());
                            estEncontrado = true;
                            break;
                        }
                    }
                    if (!estEncontrado){
                        System.out.println("NOME NAO ENCONTRADO");
                    }
                    break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
            break;
        }
    }

    //
    public void todos(Estudante estudante[], int quantidade){
        for (int i = 0; i < estudante.length; i++) {
            System.out.println("\nNOME   : " + estudante[i].getNome());
            System.out.println("IDADE  : " + estudante[i].getIdade());
            System.out.println("NUMERO : " + estudante[i].getNumero());
            System.out.println("GENERO : " + estudante[i].getGenero());
            System.out.println("CURSO  : " + estudante[i].getCurso());
            System.out.println("");
        }
    }
}
