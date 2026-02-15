package entities;

public class Estudante {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;


    public Estudante(){

    }

    public Estudante(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    //Nota 1
    public void setNota1 (double nota1){
        this.nota1 = nota1;
    }

    public double getNota1(){
        return nota1;
    }

    //Nota 2
    public void setNota2 (double nota2){
        this.nota2 = nota2;
    }

    public double getNota2(){
        return nota2;
    }

    //Nota 3
    public void setNota3 (double nota3){
        this.nota3 = nota3;
    }

    public double getNota3(){
        return nota3;
    }

}
