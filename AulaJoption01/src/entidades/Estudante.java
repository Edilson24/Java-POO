package entidades;

public class Estudante {
    private int codigo;
    private String nome;
    private float altura;

    public Estudante() {
    }

    public Estudante(int codigo, String nome, float altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
