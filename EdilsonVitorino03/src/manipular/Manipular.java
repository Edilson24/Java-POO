package manipular;

import enums.Genero;
import java.util.Scanner;
import modelo.Estudante;

//@EdilsonHilario

public class Manipular {

    //a) 
    public void cadastrar(Estudante estudante[], int quantidade) {
        for (int i = 0; i < estudante.length; i++) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("-----------" + (i + 1) + "---------");
            System.out.println("Nome do estudante:");
            String nomeEstudante = entrada.nextLine();
            
            int idadeEstudante;
            do{
                
                System.out.println("Insira sua idade: ");
                idadeEstudante = entrada.nextInt();
                
                if(idadeEstudante < 1){
                    System.out.println("Insira idade maior que 1");
                }
                
            }while(idadeEstudante < 1);
            
            //Enum
            Genero sexo = null;

            while (sexo == null) {
                System.out.println("1 - MASCULINO\n2 - FEMENINO\nQual o seu genero: ");
                int opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        sexo = Genero.MASCULINO;
                    break;

                    case 2:
                        sexo = Genero.FEMENINO;
                    break;

                    default:
                        System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
                }

            }
            double nota1;
            double nota2;

            //Validacao de nota 1
            do {
                System.out.println("Nota 1: ");
                nota1 = entrada.nextDouble();

                if (nota1 > 1 || nota1 <= 20) {
                    System.out.println("Digite valores entre 1 a 20");
                }
            } while ((nota1 > 1) || (nota1 <= 20));

            //Validacao de nota 2
            do {

                System.out.println("Nota 2: ");
                nota2 = entrada.nextDouble();

                if (nota2 > 1 || nota2 <= 20) {
                    System.out.println("Digite valores entre 1 a 20");
                }
            } while ((nota2 > 1) || (nota2 <= 20));

            estudante[i] = new Estudante(nota1, nota2, nomeEstudante, idadeEstudante, sexo);
        }
    }

    //b)e c) Fazer calculo de media
    public double calculoMedia(Estudante estudante[], int quantidade) {
        double media = 0;
        for (int i = 0; i < estudante.length; i++) {
            media = ((estudante[i].getNota1() + estudante[i].getNota2()) / 2);

            if (media < 10) {
                System.out.printf("%s, reprovou com: %.2f\n", estudante[i].getNome(), media);

            } else if (media <= 15) {
                System.out.printf("%s, aprovado com: %.2f\n", estudante[i].getNome(), media);
            } else {
                System.out.printf("%s, dispensou com %.2f\n", estudante[i].getNome(), media);
            }
        }
        return media;
    }

    //d) Mostrar quantidade 
    public int quantidadeMasculino(Estudante estudante[], int quantidade) {
        int totalMasculino = 0;
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i].getGenero() == Genero.MASCULINO) {
                totalMasculino++;
            }
        }
        return totalMasculino;

    }

    //e)Mostrar estudantes mais novos
    public int estudanteMaisnovo(Estudante estudante[], int quantidade) {
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i].getIdade() <= 17) {
                System.out.println(" - " + estudante[i].getNome());

            }
        }
        return 0;
    }

    //Metodo para validação
    public int validarInteiro() {
        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Quantos deseja cadastrar: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Apenas digite valores inteiros");
            }
        } while (numero < 0);
        return numero;

    }

}