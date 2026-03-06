package manipular;

import entidades.Candidato;
import enums.Genero;
import enums.Nacionalidade;
import enums.Vagas;
import java.util.Scanner;

public class Manipular {

    public void cadastrar(Candidato candidato[], int quantidade){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < candidato.length; i++){

            String nomeCandidato, especialidade;
            int idadeCandidato, opcao, opcaon, opcaov, anoInicio;

            System.out.println();

            System.out.print("Qual o seu nome: ");
            nomeCandidato = input.nextLine();

            System.out.println();

            System.out.print("Qual é a sua idade: ");
            idadeCandidato = input.nextInt();

            //Inserir País
            System.out.println();
            Nacionalidade nacionalidade = null;
            while (nacionalidade == null){
                System.out.print("1 - MOÇAMBIQUE\n2 - AFRICA DO SUL\n3 - ANGOLA\n4 - BOTSWANA\nQual é a sua Nacionalidade: ");
                opcaon = input.nextInt();

                switch (opcaon){
                    case 1:
                        nacionalidade = Nacionalidade.MOCAMBIQUE;
                    break;

                    case 2:
                        nacionalidade = Nacionalidade.AFRICA_DO_SUL;
                    break;

                    case 3:
                        nacionalidade = Nacionalidade.ANGOLA;
                    break;

                    case 4:
                        nacionalidade = Nacionalidade.BOTSWANA;
                    break;

                    default:
                        System.out.println("Opção Invalida. Tente Novamente");
                }
            }

            System.out.println();

            System.out.print("Qual o ano de inicio: ");
            anoInicio = input.nextInt();

            //Vaga que pretende concorrer
            System.out.println();
            Vagas vagas = null;
            while (vagas == null){
                System.out.print("1 - PYTHON\n2 - DART\n3 - JAVASCRIPT\n4 - C CHARP\n5 - JAVA\nSelecione a vaga pretendida: ");
                opcaov = input.nextInt();

                switch (opcaov){
                    case 1:
                        vagas = Vagas.PYTHON;
                    break;

                    case 2:
                        vagas = Vagas.DART;
                    break;

                    case 3:
                        vagas = Vagas.JAVASCRIPT;
                    break;

                    case 4:
                        vagas = Vagas.C_SHARP;
                    break;

                    case 5:
                        vagas = Vagas.JAVA;
                    break;
                }
            }

            //Inserir Genero
            System.out.println();
            Genero genero = null;
            while (genero == null){
                System.out.print("1 - MASCULINO\n2 - FEMENINO\nQual é o seu genero: ");
                opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        genero = Genero.MASCULINO;
                    break;

                    case 2:
                        genero = Genero.FEMENINO;
                    break;

                    default:
                        System.out.println("Opção Invalida. Tente Novamente");
                }
            }
        input.nextLine();
        candidato[i] = new Candidato(nomeCandidato, idadeCandidato, nacionalidade, genero, vagas, anoInicio);
        }
    }

    public void mocambicanos(Candidato candidato[], int quantidade){
        for (int i = 0; i < candidato.length; i++){
            if (candidato[i].getNacionalidade() == Nacionalidade.MOCAMBIQUE){
                System.out.println(candidato[i].getNomeCompleto());
            }
        }
    }

    //Mostrar dados dos candidatos que se candidataram
    public void javaedart(Candidato candidato[], int quantidade){
        for (int i = 0; i < candidato.length; i++) {
            if (candidato[i].getVagas() == Vagas.DART || candidato[i].getVagas() == Vagas.JAVA) {
                System.out.println("-------------------------------------");
                System.out.println("Nome           : " + candidato[i].getNomeCompleto() + "\nIdade          : " + candidato[i].getIdade());
                System.out.println("Nacionalidade  : " + candidato[i].getNacionalidade() + "\nAno de inicio  : " + candidato[i].getAnoInicio());
                System.out.println("Vaga escolhida : " +candidato[i].getVagas() + "\nGenero         : " + candidato[i].getGenero());
            }
        }
    }

    //Mostrar Candidatos do genero femenino, da Africa do sul que usam python
    public void femeninoaficadosulpython(Candidato candidato[], int quantidade){
        for (int i = 0; i < candidato.length; i++) {
            if (candidato[i].getGenero() == Genero.FEMENINO && candidato[i].getNacionalidade() == Nacionalidade.AFRICA_DO_SUL && candidato[i].getVagas() == Vagas.PYTHON) {
                System.out.println(candidato[i].getNomeCompleto());
            }
        }
    }

    //Numero de homens de Botswana
    public void botswanamaculino(Candidato candidato[], int quantidade){
        int numero = 0;
        for (int i = 0; i < candidato.length; i++) {
            if(candidato[i].getGenero() == Genero.MASCULINO && candidato[i].getNacionalidade() == Nacionalidade.BOTSWANA){
                numero += 1;
            }
        }
        System.out.println(numero);
    }
}