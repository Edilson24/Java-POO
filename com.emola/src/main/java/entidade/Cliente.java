package entidade;

import enums.Genero;
import enums.Pais;

public class Cliente {
    private String nome;
    private Genero genero;
    private Conta conta;
    private Pais pais;

    public Cliente(String nome, Genero genero, Conta conta, Pais pais) {
        this.nome = nome;
        this.genero = genero;
        this.conta = conta;
        this.pais = pais;
    }

    public String getNome() { return nome; }
    public Genero getGenero() { return genero; }
    public Conta getConta() { return conta; }
    public Pais getPais() { return pais; }
}