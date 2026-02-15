package manipular;

import entidades.Cliente;
import enums.Genero;
import enums.Nacionalidade;
import enums.TipoConta;
import enums.TipoMoeda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manipular {
    private  List<Cliente> listaCliente;

    public Manipular(){
        listaCliente = new ArrayList<>();
    }

    public void cadastrar(){
        Scanner input = new Scanner(System.in);

        String nomeCliente, numConta;

        float saldoCliente = 0;

        System.out.println("");
        System.out.print("Qual o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println();

        System.out.println("Digite seu numero de conta: ");
        numConta = input.nextLine();
        System.out.println();


        Genero genero = null;
        while (genero == null){
            System.out.print("1 - MASCULINO\n2 - FEMININO\nQual o seu genero: ");
            int opcao = input.nextInt();

            switch (opcao){
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
        System.out.println();

        Nacionalidade nacionalidade = null;
        while (nacionalidade == null){
            System.out.print("1 - NACIONAL\n2 - ESTRANGEIRO\nQual a sua nacionalidade: ");
            int opcaon = input.nextInt();

            switch (opcaon){
                case 1:
                    nacionalidade = Nacionalidade.NACIONAL;
                    break;

                case 2:
                    nacionalidade = Nacionalidade.ESTRANGEIRO;
                    break;

                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE");
            }
        }
        System.out.println();

        TipoConta tipoConta = null;
        while (tipoConta == null){
            System.out.print("1 - CORRENTE\n2 - POUPANCA\n3 - EMPRESARIAL\nEscolhe o seu tipo de conta: ");
            int opcaon = input.nextInt();

            switch (opcaon){
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
        System.out.println();

        TipoMoeda tipoMoeda = null;
        while (tipoMoeda == null){
            System.out.print("1 - METICAL\n2 - DOLAR\n3 - EURO\nQual o seu tipo de moeda: ");
            int opcaom = input.nextInt();

            switch (opcaom){
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

        Cliente cadaCliente = new Cliente(nomeCliente, genero, nacionalidade, numConta, saldoCliente, tipoConta, tipoMoeda);
        listaCliente.add(cadaCliente);
    }

    public void mostrar(){
        for(Cliente cadaCliente : listaCliente){
            System.out.println("");
            System.out.println("Nome            : " + cadaCliente.getNome());
            System.out.println("Genero          : " + cadaCliente.getGenero());
            System.out.println("Nacionalidade   : " + cadaCliente.getNacionalidade());
            System.out.println("Numero de conta : " + cadaCliente.getNumeroConta());
            System.out.println("Tipo de conta   : " + cadaCliente.getTipoConta());
            System.out.println("Tipo de moeda   : " + cadaCliente.getTipoMoeda());
            System.out.println("Saldo           : " + cadaCliente.getSaldo());
            System.out.println("");
        }
    }

    public void depositar(){
        for(Cliente cadaCliente : listaCliente){
            Scanner input = new Scanner(System.in);
            float valorAnterior, deposito;
            String nc;
            valorAnterior = cadaCliente.getSaldo();

            System.out.print("Digite o numero de conta: ");
            nc = input.nextLine();

            if(cadaCliente.getNumeroConta().equals(nc)){
                System.out.println("Quanto deseja depositar: ");
                deposito = input.nextFloat();

                cadaCliente.setSaldo(valorAnterior + deposito);

                System.out.println("Nome   : " + cadaCliente.getNome());
                System.out.println("Saldo  : " + cadaCliente.getSaldo());
            }
            else {
                System.out.println("NUMERO DE CONTA NAO ENCONTRADO");
            }

        }
    }
}
