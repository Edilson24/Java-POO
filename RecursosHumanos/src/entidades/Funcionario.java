package entidades;

import enums.Genero;
import enums.Nacionalidade;
import enums.Profissao;

public class Funcionario extends Pessoa{
    private int anoContratacao;
    private Profissao profissao;

    public Funcionario() {
    }

    public Funcionario(String nome, Nacionalidade nacionalidade, int idade, Genero genero, int anoContratacao, Profissao profissao) {
        super(nome, nacionalidade, idade, genero);
        this.anoContratacao = anoContratacao;
        this.profissao = profissao;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
