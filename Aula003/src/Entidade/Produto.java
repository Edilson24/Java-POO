package Entidade;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void  setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void  setPreco(Double preco){
        this.preco = preco;

        public Double getPreco(){
            return preco;
        }

}
