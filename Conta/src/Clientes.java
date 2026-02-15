import Cliente.Dados;

public class Clientes {
    public static void main(String[] args){
        Dados inf = new Dados();

        inf.nome = "Edilson";
        inf.numConta = 1234567;


        System.out.println(inf.nome);
        System.out.println(inf.numConta);
        System.out.println(inf.getSaldo());

    }
}
