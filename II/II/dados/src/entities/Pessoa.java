/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enus.Genero;
import java.util.Scanner;

/**
 *
 * @author mussa
 */

 
public class Pessoa {
    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

      public void cadastro(Pessoa []pessoa, int quantidade){
        Scanner input = new Scanner(System.in);
    
        for(int i = 0; i< quantidade; i++){
            pessoa[i] = new Pessoa();
            System.out.println("Nome: ");
            String nome = input.nextLine();
            pessoa[i].setNome(nome);
            
             System.out.println("Idade: ");
            int idade = input.nextInt();
            pessoa[i].setIdade(idade);
            
             System.out.println("Selecione;[1]=>Masculino\n[2]=>Femenino: ");
             int opcoes = input.nextInt();
             input.nextLine();
             if (opcoes == 1){
                 pessoa[i].setGenero(genero.MASCULINO);
             }else if (opcoes == 2){
                 pessoa[i].setGenero(genero.FEMENINO);
             }
            
        }
}
      
  
      
      public void lista(Pessoa []pessoa, int quantidade){
        Scanner input = new Scanner(System.in);
    
        for(int i = 0; i< quantidade; i++){
            System.out.println("Nome Completo: "+pessoa[i].getNome()+", Idade: "+pessoa[i].getIdade()+", Genero:"+pessoa[i].getGenero());
            
        }
}
  

}
