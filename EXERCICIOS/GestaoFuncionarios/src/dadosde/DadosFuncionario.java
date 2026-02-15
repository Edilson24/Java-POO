package dadosde;

public class DadosFuncionario {
    //ATRIBUTOS DOS FUNCIONARIOS
    public String nome;
    public float salario;
    public float imposto;

    //FUNCIONALIDADOS
    public void renda (int salario){
        this.salario += salario;
    }

    public void saida (int imposto){
        this.imposto += imposto;
    }
    public void aumento (int salario){
        this.salario += salario;
    }

    public String toString(){
        return String.format("Nome do funcionario :%s", nome)
                + String.format("\nSalário líquido     :%.2f", salario);
    }
}
