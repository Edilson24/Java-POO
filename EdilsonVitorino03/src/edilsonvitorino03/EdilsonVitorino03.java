package edilsonvitorino03; 

import java.util.Scanner;
import manipular.Manipular;
import modelo.Estudante;

public class EdilsonVitorino03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Manipular manipular = new Manipular();
        
        
        int quantidade = manipular.validarInteiro();
        Estudante estudante[] = new Estudante[quantidade];
        
        
        //Chamando o metodo de cadastro
        manipular.cadastrar(estudante, quantidade);
        
        //Chamando metodo de calculo de media
        double m = manipular.calculoMedia(estudante, quantidade);
        
        //Chamando metodo que mostra quantidade de genero masculino
        System.out.println(manipular.quantidadeMasculino(estudante, quantidade));
        
        //Metodo que mostra estudantes com idade menor que 17
        System.out.println("Estudantes mais novos:");
        manipular.estudanteMaisnovo(estudante, quantidade);
        
        
    }
      
        
        
    
    
}
