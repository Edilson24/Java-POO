/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dados;

import entities.Pessoa;
import java.util.Scanner;

/**
 *
 * @author mussa
 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();
        Pessoa[] pessoa = new Pessoa[quantidade];
        Pessoa p = new Pessoa();
        
        p.cadastro(pessoa, quantidade);
        p.lista(pessoa, quantidade);
        
    }
    
}
