/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicao;

import entities.Cliente;
import java.util.Scanner;
import manipular.Manipular;

/**
 *
 * @author mussa
 */
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();
        Cliente cliente[] = new Cliente[quantidade];
        Manipular controller = new Manipular();
        
        controller.cadastro(cliente, quantidade);
        controller.listar(cliente, quantidade);
        System.out.println("Genero Masculino: ");
        controller.generoMasculino(cliente, quantidade);    
        
        System.out.println("Quantidade do Genero Masculino:");
        int dados = controller.somaMasculino(cliente, quantidade);
        System.out.println("numero total do Genero Masculino e: "+dados);
    }
    
}
