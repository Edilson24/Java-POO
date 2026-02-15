/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Cursos;
import enums.GeneroLivro;


/**
 *
 * @author hp
 */
public class Biblioteca extends Estudante{
    private String nomeLivro;
    private int anoProduct;
    private String edicao;
    private String local;
    private String autor;
    private GeneroLivro generoLivro;

    public Biblioteca() {
    }

    public Biblioteca(String nomeLivro, int anoProduct, String edicao, String local, String autor, GeneroLivro generoLivro, int numEstudante, Cursos curso) {
        super(numEstudante, curso);
        this.nomeLivro = nomeLivro;
        this.anoProduct = anoProduct;
        this.edicao = edicao;
        this.local = local;
        this.autor = autor;
        this.generoLivro = generoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getAnoProduct() {
        return anoProduct;
    }

    public void setAnoProduct(int anoProduct) {
        this.anoProduct = anoProduct;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public GeneroLivro getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(GeneroLivro generoLivro) {
        this.generoLivro = generoLivro;
    }

    
    
    
    
    
    
   
 
    
    
    
    
    
}
