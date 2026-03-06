package manipular;

import entidades.Cliente;
import enums.Genero;
import enums.Nacionalidade;
import enums.TipoConta;
import enums.TipoMoeda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    private List<Cliente> listaClientes;

    public Controlador(List <Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }

    public void cadastrar(){
        Scanner input = new Scanner(System.in);
        String nomeCliente= "", numConta = "";
        float saldoCliente = 0;
        int resp = 0;

        while (nomeCliente.isEmpty()){
            System.out.print("\nQual o seu nome: ");
            nomeCliente = input.nextLine();
            System.out.println();

            if (nomeCliente.isEmpty()){
                System.out.println("É OBRIGATORIO QUE SUA CONTA TENHA UM NOME\nTENTE NOVAMENTE");
            }
        }

        //CADASTRANDO NUMERO DE CONTA
        while (true){
            boolean numeroExiste = false;

            System.out.print("Digite o seu numero de conta: ");
            numConta = input.nextLine();

            if (numConta.length() != 6){
                System.out.println("O NUMERO DE CONTA DEVE TER\nJUSTAMENTE 6 DIGITOS\n");
            }else {
                for (Cliente cadacliente : listaClientes){
                    if(cadacliente.getNumeroConta().equals(numConta)){
                        numeroExiste = true;
                    }
                }

                if (numeroExiste){
                    System.out.println("NUMERO DE CONTA JA EXISTENTE\nTENTE OUTRO");

                    System.out.print("\n1 - SIM\n2 - NAO\nDeseja tentar outra vez: ");
                    resp = input.nextInt();

                    input.nextLine();
                    if (resp == 1){
                        continue;
                    }
                    else {
                        numConta = "";
                        break;
                    }
                }else {
                    break;
                }
            }
        }

        Genero genero = null;
        while (genero == null){
            System.out.print("\n1 - MASCULINO\n2 - FEMININO\nQual o seu genero: ");
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

        System.out.println();
        Cliente cadaCliente = new Cliente(nomeCliente, genero, nacionalidade, numConta, saldoCliente, tipoConta, tipoMoeda);
        listaClientes.add(cadaCliente);
    }

    public void mostrarTodos(){
        for (Cliente cadaCliente : listaClientes){
            System.out.println("\nNome             : " + cadaCliente.getNome());
            System.out.println("Genero           : " + cadaCliente.getGenero());
            System.out.println("Nacionalidade    : " + cadaCliente.getNacionalidade());
            System.out.println("Numero de conta  : " + cadaCliente.getNumeroConta());
            System.out.println("Saldo            : " + cadaCliente.getSaldo());
            System.out.println("Tipo de conta    : " + cadaCliente.getTipoConta());
            System.out.println("Tipo de moeda    : " + cadaCliente.getTipoMoeda());
        }
    }

    //METODO PARA DEPOSITAR VALOR
    public void depositar(){
        Scanner input = new Scanner(System.in);
        String numCont;
        float deposito;
        boolean cliEncontrado = false;

        System.out.println("\nDigite o seu numero de conta: ");
        numCont = input.nextLine();

        for (Cliente cadacliente : listaClientes){
            if (cadacliente.getNumeroConta().equals(numCont)){
                System.out.print("\nQuanto deseja depositar: ");
                deposito = input.nextFloat();

                cadacliente.setSaldo(cadacliente.getSaldo() + deposito);

                System.out.println("DEPOSITO FEITO COM SUCESSO");
                System.out.println("Nome   : " + cadacliente.getNome());
                System.out.println("Saldo  : " + cadacliente.getSaldo());
                cliEncontrado = true;
                break;
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO\n");
        }
    }

    public void levantar(){
        Scanner input = new Scanner(System.in);
        String numCont;
        float levantamento, taxa = 8;
        boolean cliEncontrado = false;

        System.out.print("Digite seu numero de conta: ");
        numCont = input.nextLine();

        for(Cliente cadaCliente : listaClientes){
            if (cadaCliente.getNumeroConta().equals(numCont)){
                System.out.print("Quanto deseja levantar: ");
                levantamento = input.nextFloat();

                if (cadaCliente.getSaldo() < levantamento){
                    System.out.println("SALDO INSUFICIENTE PARA LEVANTAR\nESSA QUANTIA");
                    cliEncontrado = true;
                    break;
                }
                else {
                    cadaCliente.setSaldo(cadaCliente.getSaldo() - levantamento - taxa);

                    System.out.println("\nLEVANTADO COM SUCESSO");
                    System.out.println("NOME  : " + cadaCliente.getNome());
                    System.out.println("SALDO : " + cadaCliente.getSaldo());
                    cliEncontrado = true;
                    break;
                }
            }
        }
        if (!cliEncontrado){
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO\n");
        }
    }

    //
    public void clienteMetical(){
        for (Cliente cadaCliente : listaClientes){
            if (cadaCliente.getTipoMoeda() == TipoMoeda.METICAL){
                System.out.println("\nNome  : " + cadaCliente.getNome());
                System.out.println("Saldo : " + cadaCliente.getSaldo());
            }
        }
    }

    public void transferir() {
        Scanner input = new Scanner(System.in);
        String numOrigem, numDestino;
        float transf;
        Cliente origem = null, destino = null;

        System.out.println("Digite a conta origem: ");
        numOrigem = input.nextLine();

        System.out.println("Digite a conta destino: ");
        numDestino = input.nextLine();

        for (Cliente cadaCliente : listaClientes){
            if (cadaCliente.getNumeroConta().equals(numOrigem)){
                origem = cadaCliente;
            }
            if (cadaCliente.getNumeroConta().equals(numDestino)){
                destino = cadaCliente;
            }
        }

        if (origem == null && destino == null){
            System.out.println("CONTA ORIGEM OU DESTINO NAO ENCONTRADA");
            return;
        }
        if (origem.getNumeroConta().equals(destino.getNumeroConta())){
            System.out.println("NAO PODE TRANSFERIR PARA MESMA CONTA");
            return;
        }

        System.out.print("Quanto deseja transferir: ");
        transf = input.nextFloat();

        if (transf > origem.getSaldo()){
            System.out.println("SALDO INSUFICIENTE PARA EFETUAR A TRANSFERENCIA");

        }else {
            origem.setSaldo(origem.getSaldo() - transf);
            destino.setSaldo(destino.getSaldo() + transf);

            System.out.println("\nTRANSFERENCIA FEITA COM SUCESSO");
            System.out.println("ORIGEM   : " + origem.getNome());
            System.out.println("SALDO    : " + origem.getSaldo());

            System.out.println("\nSALDO    : " + destino.getSaldo());
            System.out.println("SALDO    : " + destino.getSaldo());
        }


    }
}