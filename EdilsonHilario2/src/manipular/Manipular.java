/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipular;

import entidades.Biblioteca;
import enums.GeneroLivro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hp
 */
public class Manipular {
    
//Alineua a)
    public void cadastrar(Biblioteca biblioteca[], int quantidade) {
        for (int i = 0; i < biblioteca.length; i++) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o nome do livro: ");
            String nomedolivro = input.nextLine();
            biblioteca[i].setNomeLivro(nomedolivro);

            System.out.print("Qual o ano de publicacao: ");
            int anoLivro = input.nextInt();
            biblioteca[i].setAnoProduct(anoLivro);

            System.out.print("Qual a edicao do livro: ");
            String edicaoDolivro = input.nextLine();
            biblioteca[i].setEdicao(edicaoDolivro);

            System.out.print("Onde foi publicado: ");
            String localPub = input.nextLine();
            biblioteca[i].setLocal(localPub);

            System.out.print("Quem o autor da obra: ");
            String nomeDoAutor = input.nextLine();
            biblioteca[i].setAutor(nomeDoAutor);
            
            GeneroLivro generolivro = null;
            while (generolivro == null){
                System.out.println("1 - LITERARIO,\n2 -  ROMANCE,\n3 - PROGRAMACAO,\n4 - FYCI;");
                System.out.println("Selecione o genero do livro:");
                int opcao = input.nextInt();
                
                switch(opcao){
                    case 1:
                        generolivro = GeneroLivro.LITERARIO;
                    break;
                    
                    case 2:
                        generolivro = GeneroLivro.ROMANCE;
                    break;
                    
                    case 3:
                        generolivro = GeneroLivro.PROGRAMACAO;
                    break;
                    
                    case 4:
                        generolivro = GeneroLivro.FYCI;
                    break;
                    
                    default:
                        System.out.println("Opcao Invalida. Tente novamente");
                    
                }
                
                
            }
            
            
            
            
            
            
            
        }

    }
    
    //Alinea b)
    public void mostrar(Biblioteca biblioteca[], int quantidade) {
        for (int i = 0; i < biblioteca.length; i++) {
            System.out.println("Nome do autor : " + biblioteca[i].getAutor());
            System.out.println("Edicao da obra: " + biblioteca[i].getEdicao());
            System.out.println(biblioteca[i].getNomeLivro());
        }
    }
    
    //Alinea C) Mostrar a quantidade de livros de programacao
    
    
        
    
    

}
