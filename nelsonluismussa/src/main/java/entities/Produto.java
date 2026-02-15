/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author mussa
 */
public class Produto {
    
    public String nomeProduto;
    public double preco;
    public int quantidade;

    
    public double totalValorStck(){
        return preco * quantidade;
    }
    
    
    public void adicionar(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }
    
    
    public String toString(){
        return "Nome do Produto: " +nomeProduto
                +"\nPreço: " +String.format("%.2f", preco)
                +"\nQunaitdade : "+quantidade
                +"\nTotal: " + String.format("%.2f", totalValorStck());
    }
    
}
