/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso;

import entities.Estudante;
import java.util.Scanner;
import manipular.ManipularEstudante;

/**
 *
 * @author mussa
 */
public class Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entra com quantidade: ");
        int quantidade = input.nextInt();
        Estudante estudante[] =  new Estudante[quantidade];
        
        ManipularEstudante controller = new ManipularEstudante();
        controller.cadastroEstudante(estudante, quantidade);
        
        controller.mostarEstudante(estudante, quantidade);
        
    }
    
}
