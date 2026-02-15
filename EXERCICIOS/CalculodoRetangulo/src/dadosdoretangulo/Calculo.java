package dadosdoretangulo;

public class Calculo {

    //ATRIBUTOS
    public int altura;
    public float base;


    public double calculoPerimetro(){
        return 2 * (altura * base);
    }

    public double calculoArea() {
        return base * altura;
    }

    public double calDiagonal(){
        return base + altura;
    }


    public String toString(){
        return String.format("Perimetro vale  :%.2f", calculoPerimetro())
                + String.format("\nA area vale     :%.2f", calculoArea())
                + String.format("\nA diagonal vale :%.2f", calDiagonal());
    }
}
