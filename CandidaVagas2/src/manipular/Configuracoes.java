package manipular;

import entidades.Cliente;
import enums.Genero;
import enums.Nacionalidade;
import enums.TipoConta;
import enums.TipoMoeda;

import java.util.List;
import java.util.Scanner;

public class Configuracoes {
    private List<Cliente> listaClientes;

    public Configuracoes(List <Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }

    //CONFIGURACAO DE GENERO
    public void confGenero(){
        Scanner input = new Scanner(System.in);
        String numConta;
        int opcaog;
        boolean numEncontrado = false;

        System.out.println("Digite o seu numero de conta: ");
        numConta = input.nextLine().trim();

        for (Cliente cadaCliente : listaClientes) {
            if (cadaCliente.getNumeroConta().equals(numConta)){


                Genero genero = null;
                while (genero == null){
                    System.out.print("1 - MASCULINO\n2 - FEMININO\nQual o seu genero: ");
                    opcaog = input.nextInt();

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
                numEncontrado = true;
                cadaCliente.setGenero(genero);
                System.out.println("ALTERACAO FEITA COM SUCESSO");
                break;
            }
        }
        if (!numEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
        }
    }

    //CONFIGURACAO DE NOME
    public void confNome(){
        Scanner input = new Scanner(System.in);
        String numCont, novoNomeP, novoNomeS;
        Boolean cliEncontrado = false;

        System.out.println("Digite seu numero de conta: ");
        numCont = input.nextLine().trim();

        for (Cliente cadaCliente : listaClientes) {
            if (cadaCliente.getNumeroConta().equals(numCont)){
                while (true){
                    System.out.print("\nDigite o novo nome           : ");
                    novoNomeP = input.nextLine().trim();

                    System.out.print("Digite novamente o novo nome : ");
                    novoNomeS = input.nextLine().trim();

                    if (novoNomeP.equals(novoNomeS)){
                        cadaCliente.setNome(novoNomeS);
                        System.out.println("NOME ALTERADO COM SUCESSO");
                        cliEncontrado = true;
                        break;
                    }else {
                        System.out.println("NOME INVALIDO.DIGITE\n" +
                                           "DUAS VEZES O NOVO NOME\n" +
                                           "NAO PODE HAVER DIFERENCA\n" +
                                           "TENTE NOVAMENTE");
                    }
                }
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
        }
    }

    //CONFIGURACAO DE NACIONALIDADE
    public void confNacionalidade(){
        Scanner input = new Scanner(System.in);
        String numCont;
        boolean cliEncontrado = false;

        System.out.println("Didite o seu nomero de conta: ");
        numCont = input.nextLine().trim();

        for (Cliente cadaCliente : listaClientes) {
            if (cadaCliente.getNumeroConta().equals(numCont)){

                Nacionalidade nacionalidade = null;
                while (nacionalidade == null){
                    System.out.println("1 - NACIONAL\n2 - ESTRANGEIRO\nQual a sua nacionalidade: ");
                    int opcaon = input.nextInt();

                    switch (opcaon){
                        case 1:
                            nacionalidade = Nacionalidade.NACIONAL;
                        break;

                        case 2:
                            nacionalidade = Nacionalidade.ESTRANGEIRO;
                        break;

                        default:
                            System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE\n");
                    }
                }
                cadaCliente.setNacionalidade(nacionalidade);
                cliEncontrado = true;
                System.out.println("NACIONALIDADE ALTERADA COM SUCESSO");
                break;
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO\n");
        }

    }

    //CONFIGURACAO DE TIPO DE CONTA
    public void confTipoconta(){
        Scanner input = new Scanner(System.in);
        String numCont;
        boolean cliEncontrado = false;

        System.out.println("Digite seu numero de conta: ");
        numCont = input.nextLine().trim();

        for (Cliente cadaCliente : listaClientes){
            if (cadaCliente.getNumeroConta().equals(numCont)){

                TipoConta tipoConta = null;
                while (tipoConta == null){
                    System.out.print("\n1 - CORRENTE\n" +
                            "2 - POUPANCA\n" +
                            "3 - EMPRESARIAL\n" +
                            "Escolhe o seu tipo de conta: ");

                    int opcaom = input.nextInt();
                    switch (opcaom){
                        case 1:
                            tipoConta = TipoConta.CORRENTE;
                        break;

                        case 2:
                            tipoConta = TipoConta.POUPANCA;
                            break;

                        case 3:
                            tipoConta = TipoConta.EMPRESARIAL;
                        break;

                        default:
                            System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
                    }
                }

                cadaCliente.setTipoConta(tipoConta);
                cliEncontrado = true;
                break;
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
        }
    }

    //CONFIGURACAO DE TIPO DE MOEDA
    public void confTipomoeda(){
        Scanner input = new Scanner(System.in);
        boolean cliEncontrado = false;
        String numCont;

        System.out.println("\nDigite seu nomero de conta: ");
        numCont = input.nextLine().trim();

        for(Cliente cadaCliente : listaClientes){
            if (cadaCliente.getNumeroConta().equals(numCont)){

                TipoMoeda tipoMoeda = null;
                while (tipoMoeda == null){
                    System.out.print("1 - METICAL\n2 - DOLAR\n3 - EURO\nQual o seu tipo de moeda: ");

                    int opcaot = input.nextInt();

                    switch (opcaot){
                        case 1:
                            tipoMoeda = TipoMoeda.METICAL;
                        break;

                        case 2:
                            tipoMoeda = TipoMoeda.DOLAR;
                        break;

                        case 3:
                            tipoMoeda = TipoMoeda.EURO;
                        break;

                        default:
                            System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
                    }
                }

                cadaCliente.setTipoMoeda(tipoMoeda);
                cliEncontrado = true;
                break;
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
        }
    }

    public void confNumconta(){
        Scanner input = new Scanner(System.in);
        boolean cliEncontrado = false;
        String numContp, numConts, numCont;

        System.out.println("\nDigite seu numero de conta: ");
        numCont = input.nextLine().trim();

        for (Cliente cadaCliente : listaClientes){
            if (cadaCliente.getNumeroConta().equals(numCont)){

                System.out.println("Digite o novo numero de conta: ");
                numContp = input.nextLine().trim();

                System.out.println("Digite-o novamente");
                numConts = input.nextLine().trim();

                if (!numContp.equals(numConts)){
                    System.out.println("NUMEROS SAO DIFERENTES");
                } else if (numContp.length() != 6 && numConts.length() != 6) {
                    System.out.println("DEVEM SER DIGITADOS JUSTAMENTE 6 DIGITOS");
                }else{
                    cadaCliente.setNumeroConta(numConts);
                }

                cliEncontrado = true;
                break;
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
        }
    }
}
