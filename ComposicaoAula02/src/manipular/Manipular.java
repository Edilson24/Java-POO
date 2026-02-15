/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipular;

import entities.Cliente;
import entities.Endereco;
import enums.Destino;
import enums.Genero;
import java.util.Scanner;

/**
 *
 * @author mussa
 */
public class Manipular {

    // A)aaa
    public void cadastro(Cliente cliente[], int quantidade) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Nome do Cliente: ");
            String nomeCliente = input.nextLine();


            Genero genero = null;

            while (genero == null) {
                System.out.println("Selecione:\n1->Masculino\n2->Femenino");
                int opcoes = input.nextInt();
                input.nextLine(); // Corrige o problema do buffer
                if (opcoes == 1) {
                    genero = Genero.MASCULINO;
                } else if (opcoes == 2) {
                    genero = Genero.FEMENINO;
                } else {
                    System.out.println("Valor Invalido, [1, 2]");
                }
            }


            Destino destino = null;

            while (destino == null) {
                System.out.println("Selecione:\n1->Nampula\n2->Niassa\n3->Cabo Delgado");
                int opcoes = input.nextInt();
                input.nextLine(); // Corrige o problema do buffer
                if (opcoes == 1) {
                    destino = Destino.NAMPULA;
                } else if (opcoes == 2) {
                    destino = Destino.NIASSA;
                } else if (opcoes == 3) {
                    destino = Destino.CABO_DELGADO;
                } else {
                    System.out.println("Valor Invalido, [1, 2, 3]");
                }

            }

            System.out.println("Rua: ");
            String ruaCliente = input.nextLine();


            System.out.println("Codigo Posta: ");
            int codPostal = input.nextInt();
            input.nextLine(); // Corrige o problema do buffer

            System.out.println("Telefone: ");
            int telCliente = input.nextInt();

            System.out.println("Cidade: ");
            String cidadeCliente = input.nextLine();
            input.nextLine();

            Endereco endereco = new Endereco(ruaCliente, telCliente, codPostal, cidadeCliente);

            cliente[i] = new Cliente(nomeCliente, genero, destino, endereco);

        }
    }

    // B
    public void listar(Cliente cliente[], int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome: " + cliente[i].getNome() + " Genero: " + cliente[i].getGenero() + "Destino: " + cliente[i].getDestino() + "Rua: " + cliente[i].getEndereco().getRua() + "Telefone: " + cliente[i].getEndereco().getTelefone() + "Codigo Postal: " + cliente[i].getEndereco().getCodigoPostal() + "Cidade: " + cliente[i].getEndereco().getCidade());

        }
        
        
    }    

    // C
    public void generoMasculino(Cliente cliente[], int quantidade) {
        for (int i = 0; i < quantidade; i++) {
             if (cliente[i].getGenero() == Genero.MASCULINO){
                 System.out.println("Nome: "+cliente[i].getNome()+"Genero: "+cliente[i].getGenero());
             }
        }
    }
    
    //D
    public int somaMasculino(Cliente cliente[], int quantidade){
        int total = 0;
        
        for(int i = 0; i <quantidade; i++){
            if (cliente[i].getGenero() == Genero.MASCULINO){
                total ++;
            }
        }
        return total;
    }
}
