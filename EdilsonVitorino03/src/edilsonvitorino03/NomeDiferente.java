/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edilsonvitorino03;

import java.util.Scanner;

/**
 *
 * @author Edilson
 */
public class NomeDiferente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        do{
            System.out.print("Digite numero inteiro: ");
            numero = entrada.nextInt();
            
            if (numero <= 0){
                System.out.println("Apenas digite valores inteiros");
            }
        }while (numero < 0);
        
        
    }
}
