package entiteis;

public class Estudante {
    //Atributos
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    //Metodo sem paramentro
    public Estudante (){
    }

    //Metodos com paramentro
    public Estudante(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public  void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    //Nota 1
    public  void setNota1(double notas1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return nota1;
    }

    //Nota2
    public  void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2() {
        return nota2;
    }

    //Nota3
    public  void setNota3(double notas3){
        this.nota3 = nota3;
    }
    public double getNota3() {
        return nota3;
    }
}
