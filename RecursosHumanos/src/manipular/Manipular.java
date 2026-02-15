package manipular;

import entidades.Funcionario;
import enums.Genero;
import enums.Nacionalidade;
import enums.Profissao;

import java.util.List;
import java.util.Scanner;

public class Manipular {
    private List <Funcionario> listaFuncionario;

    public Manipular(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public void cadastrar(){

        Scanner input = new Scanner(System.in);
        String nomeFuncionario;
        int idadeFuncionario, anoNascimento, anoContratacao;

        System.out.print("\nQual o seu nome: ");
        nomeFuncionario = input.nextLine();

        System.out.print("Qual a sua idade: ");
        idadeFuncionario = input.nextInt();

        System.out.println("Em que ano foi contratado: ");
        anoContratacao = input.nextInt();

        Nacionalidade nacionalidade = null;
        while (nacionalidade == null){
            System.out.print("\n1 - MOCAMBICANA\n" +
                    "2 - BRASILEIRA\n" +
                    "3 - CHINESE\n" +
                    "Qual a sua nacionalidade: ");

            int opcaon = input.nextInt();
            switch (opcaon){
                case 1:
                    nacionalidade = Nacionalidade.MOCAMBICANA;
                break;

                case 2:
                    nacionalidade = Nacionalidade.BRASILEIRA;
                break;

                case 3:
                    nacionalidade = Nacionalidade.CHINESA;
                break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }

        Genero genero = null;
        while (genero == null){
            System.out.print("\n1 - MASCULINO\n2 - FEMININO\nQual o seu genero: ");
            int opcaog = input.nextInt();

            switch (opcaog){
                case 1:
                    genero = Genero.MASCULINO;
                break;

                case 2:
                    genero = Genero.FEMININO;
                break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE!");
            }
        }

        Profissao profissao = null;
        while (profissao == null){
            System.out.print("\n1 -  RECURSOS HUMANOS\n" +
                    "2 -  ENGENHARIA MECANICA\n" +
                    "3 -  ENGENHARIA ELETRICA\n" +
                    "4 -  ENGENHARIA AGRICOLA\n" +
                    "5 -  AGENTE DE LIMPEZA\n" +
                    "6 -  ADVOGADO\n" +
                    "7 -  COMUNISTA\n" +
                    "8 -  JARDINEIRO\n" +
                    "9 -  MOTORISTA\n" +
                    "10 - TECNOLOGIA DE INFORMACAO\n" +
                    "Em que area es formado: ");

            int opcaoc = input.nextInt();

            switch (opcaoc){
                case 1:
                    profissao = Profissao.RECURSOS_HUMANOS;
                break;

                case 2:
                    profissao = Profissao.ENGENHARIA_MECANICA;
                break;

                case 3:
                    profissao = Profissao.ENGENHARIA_ELETRICA;
                break;

                case 4:
                    profissao = Profissao.ENGENHARIA_AGRICOLA;
                break;

                case 5:
                    profissao = Profissao.AGENTE_DE_LIMPEZA;
                break;

                case 6:
                    profissao = Profissao.ADVOGADO;
                break;

                case 7:
                    profissao = Profissao.COMUNISTA;
                break;

                case 8:
                    profissao = Profissao.JARDINEIRO;
                break;

                case 9:
                    profissao = Profissao.MOTORISTA;
                break;

                case 10:
                    profissao = Profissao.TECNOLOGIA_DE_INFORMACAO;
                break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }

        Funcionario cadaFuncionario = new Funcionario(nomeFuncionario, nacionalidade, idadeFuncionario, genero, anoContratacao, profissao);
        listaFuncionario.add(cadaFuncionario);
    }

    //QUANTIDADE DE FUNCIONARIAS CONTRATADAS EM 2023
    public int quantidadeFeminina(){
        int quantidade = 0;
        for (Funcionario cadaFuncionario : listaFuncionario){
            if (cadaFuncionario.getGenero() == Genero.FEMININO && cadaFuncionario.getAnoContratacao() == 2023){
                System.out.println("Nome : " + cadaFuncionario.getNome());
                quantidade ++;
            }
        }

        System.out.println("");
        System.out.println("Quantidade de funcionarias 2023: " + quantidade);
        return quantidade;

    }

    public void mostrarTodos(){
        for (Funcionario cadaFuncionario : listaFuncionario){
            System.out.println("\nNome                : " + cadaFuncionario.getNome());
            System.out.println("Nacionalidade       : " + cadaFuncionario.getNacionalidade());
            System.out.println("Idade               : " + cadaFuncionario.getIdade());
            System.out.println("Genero              : " + cadaFuncionario.getGenero());
            System.out.println("Ano de contratacao  : " + cadaFuncionario.getAnoContratacao());
            System.out.println("Profissao           : " + cadaFuncionario.getProfissao());
            System.out.println("");
        }
    }

    //FUNCIONARO MOCAMBICANO MAIS NOVO
    public void funcionarioMaisnovo(){
        for (Funcionario cadaFuncionario : listaFuncionario){
            if (cadaFuncionario.getNacionalidade() == Nacionalidade.MOCAMBICANA && cadaFuncionario.getIdade() < 18){
                System.out.println("\nNome                : " + cadaFuncionario.getNome());
                System.out.println("Nacionalidade       : " + cadaFuncionario.getNacionalidade());
                System.out.println("Idade               : " + cadaFuncionario.getIdade());
                System.out.println("Genero              : " + cadaFuncionario.getGenero());
                System.out.println("Ano de contratacao  : " + cadaFuncionario.getAnoContratacao());
                System.out.println("Profissao           : " + cadaFuncionario.getProfissao());
                System.out.println("");
            }
        }
    }

    //QUANTIDADE DE ADVOGADOS DO GENERO MASCULINO
    public int advogado(){
        int quantidadeAdvogados = 0;
        for (Funcionario cadaFuncionario : listaFuncionario){
            System.out.println("Nome : " + cadaFuncionario.getNome());
            quantidadeAdvogados++;
        }
        System.out.println("Quantidade : " + quantidadeAdvogados);
        return quantidadeAdvogados;
    }
}
