package manipular;

import Entidades.Funcionario;
import genero.Genero;
import nacionalidade.Nacionalidade;
import profisao.Profisao;

import java.util.Scanner;

public class Manipular {

    private Profisao Profisao;

    public void cadastrar(Funcionario funcionario[], int quantidade){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < funcionario.length; i++) {


            String nomeEstud,anodenasciEstud, anodecontratoEstud;

            int idadeEstud, dataEstud, opcao;

            System.out.print("-------------------------------\n");
            System.out.println("CADASTRANDO ESTUDANTE NUMERO:" + (i + 1));

            System.out.print("digite o seu nome: ?");
            nomeEstud = input.nextLine();

            System.out.println("digite a sua idade:  ");
            idadeEstud = input.nextInt();
            input.nextLine();


            System.out.println("digite a data da sua entrada: ");
            dataEstud = input.nextInt();
            input.nextLine();

            Genero genero = null;
            while (genero == null) {
                System.out.println("1- FEMININO\n2 - MASCULINO\nQual e o seu genero: ?");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        genero = Genero.FEMININO;
                    break;

                    case 2:
                        genero = Genero.MASCULINO;
                    break;

                    default:
                        System.out.println("OPCAO INVALIDA . TENTE NOVAMENTE");
                }
            }

            input.nextLine();
            while (true) {
                System.out.println("EM QUE DATA FOI CONTRATADO:");
                anodecontratoEstud = input.nextLine();

                if (anodecontratoEstud.length() != 4) {
                    System.out.println("NUMERO INVALIDO. APENAS SEIS DIGITOS: ");
                } else {
                    break;
                }

            }
            while (true) {
                System.out.println("digite seu ano de nascimento:");
                anodenasciEstud = input.nextLine();

                if (anodenasciEstud.length() != 4) {
                    System.out.println("NUMERO INVALIDO. APENAS SEIS DIGITOS: ");
                } else {
                    break;
                }
            }

            System.out.println();

            Profisao profisao = null;
            while (profisao== null) {
                System.out.println("1- RECURSOS HUMANOS\n" +
                        "2- ENGENHARIA_MECANICA\n" +
                        "3- ENGENHARIA_ELETRONICA\n" +
                        "4- TICS\n" +
                        "5 - ENGINHEIROS AGRARIOS\n" +
                        "6 - AGENTE_LIMPEZA\n" +
                        "7 - ADVOGADOS\n" +
                        "8 - CONTABILISTA\n" +
                        "9 -JARDINEIROS\n" +
                        "9 -MOTORISTAS\n" +
                        "selecina  a sua profisao: ");

                int opcaob = input.nextInt();

                switch (opcaob) {
                    case 1:
                        Profisao = Profisao.RECURSOS_HUMANOS;
                        break;
                    case 2:
                        Profisao = Profisao.EG_MECANICA;
                        break;
                    case 3:
                        Profisao = Profisao.EG_ELETRONICO;

                        break;
                    case 4:
                        Profisao = Profisao.TICS;

                        break;
                    case 5:
                        Profisao = Profisao.EG_AGRARIOS;

                        break;
                    case 6:
                        Profisao = Profisao.AGENTE_DE_LIMPEZA;

                        break;
                    case 7:
                        Profisao = Profisao.ADVOGADOS;

                        break;
                    case 8:
                        Profisao = Profisao.CONTABILISTA;

                        break;
                    case 9:
                        Profisao = Profisao.JARDINEIROS;

                        break;
                    case 10:
                        Profisao = Profisao.MOTORISTAS;

                        break;


                    default:
                        System.out.println("OPCAO INVALIDA.TENTE NOVAMENTE");
                }


            }
                Nacionalidade nacionalidade = null;
            while (nacionalidade==null){
                System.out.println("\n1-MOCAMBICANA\n"+
                        "2-BRASILEIRA\n"+
                                "3-CHINESA\n"+
                          "DIGITE A SUA NACIONALIDADE:" );
                int opcaov = input.nextInt();

                switch (opcaov){
                    case 1:
                        nacionalidade = Nacionalidade.MOCAMBICANA;
                        break;
                    case 2:
                        nacionalidade = Nacionalidade.BRAZILEIRA;
                        break;
                    case 3:
                        nacionalidade = Nacionalidade.CHINESA;
                        break;
                    default:
                        System.out.println(" OPCAO INVALIDA . TENTE NOVAMENTE:");
                }
            }
            funcionario[i] = new Funcionario(nomeEstud,idadeEstud,anodenasciEstud,genero,nacionalidade,profisao, anodecontratoEstud);

            }





    }
    quantidade){

        System.out.println("Estudante mais novo: ");
        for (int i = 0; i < funcionario.length;i++){
            if (funcionario[i].getIdade() <= 17){
                System.out.println("NOME:"+ funcionario[i].getNome());
                System.out.println("Idade:"+ funcionario[i].getIdade());
                System.out.println("Genero:"+ funcionario[i].getGenero());
                System.out.println("Naciolidade:"+ funcionario[i].getNacionalidade());
                System.out.println("Profisao:"+ funcionario[i].getProfisao());
                System.out.println("Datadenasci"+ funcionario[i].getAnodenasci());
                System.out.println(" datade contrato"+ funcionario[i].getAnodecontrato());
            }



        }
    }

        //d
        public int QuantEstudioso( Funcionario fUNCIONARIO[], int quantidade) {
            int numero = 0;
            System.out.println("\nQUANTIDADE DE funcionarios MASCULINOS \nQUE sao advogados: ");
            for (int i = 0; i < fUNCIONARIO.length; i++) {

                if (funcionario[i].getGenero() == Genero.MASCULINO && funcionario[i].getProfisao()) {
                    System.out.println(funcionario[i].getNome());
                    numero++;
                }
            }
            System.out.println("TOTAL:" + numero);
            return numero;
        }








    }






