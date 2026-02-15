package gestao;

import entidades.Estudante;

import javax.swing.*;

public class Gestao {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        //Introduzindo dados
    estudante.setNome(JOptionPane.showInputDialog(null, "Digite seu nome:"));
        estudante.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Altura:")));
        estudante.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo:")));

        //Acessando dados
        System.out.println("---------------------------------");
        /*System.out.println("Nome   : " + estudante.getNome());
        System.out.println("Altura : " + estudante.getAltura());
        System.out.println("Codigo : " + estudante.getCodigo());
        System.out.println("---------------------------------");
        */

        JOptionPane.showMessageDialog(null, estudante.getNome());
        JOptionPane.showMessageDialog(null, estudante.getAltura());
        JOptionPane.showMessageDialog(null, estudante.getCodigo());
    }
}
