/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nelsonluismussa;

import entities.Produto;
import java.util.Scanner;

/**
 *
 * @author mussa
 */
public class Nelsonluismussa {

    public static void main(String[] args) {
       
        Produto produts = new Produto();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do Produto: ");
        produts.nomeProduto = sc.nextLine();
        
        System.out.println("Preço: ");
        produts.preco = sc.nextDouble();
        
        System.out.println("Quantidade: ");
        produts.quantidade = sc.nextInt();
        
        System.out.println(produts);
        
        System.out.println("------------------");        
        System.out.println("Adicionar:");
        int quantidade = sc.nextInt();
        produts.adicionar(quantidade);
        
        System.out.println("------------------");    
        System.out.println(produts);
        
        System.out.println("------------------");    
        System.out.println("Remover:");
        quantidade = sc.nextInt();
        produts.removerProduto(quantidade);
        System.out.println(produts);
        
       
    }
}
