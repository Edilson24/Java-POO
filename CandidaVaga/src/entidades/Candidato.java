package entidades;

import enums.Genero;
import enums.Nacionalidade;
import enums.Vagas;

public class Candidato extends Pessoa {
    private int anoInicio;
    private Vagas vagas;

    public Candidato(String nomeCandidato, int idadeCandidato, Nacionalidade nacionalidade, Genero genero, Vagas vagas, int anoInicio) {
        super(nomeCandidato, idadeCandidato, nacionalidade, genero);
        this.anoInicio =anoInicio;
        this.vagas =vagas;
    }


    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Vagas getVagas() {
        return vagas;
    }

    public void setVagas(Vagas vagas) {
        this.vagas = vagas;
    }
}
