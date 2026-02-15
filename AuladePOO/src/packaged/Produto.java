package packaged;

public class Produto {
    public String nameProduto;
    public double preco;
    public int quantidade;

    public double totalValorStock(){
        return preco * quantidade;
    }

    public void adicionar(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

}
