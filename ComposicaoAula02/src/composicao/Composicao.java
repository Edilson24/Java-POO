
package composicao;

import entities.Cliente;
import java.util.Scanner;
import manipular.Manipular;

/**
 *
 * @author mussa
 */
public class Composicao {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();
        Cliente cliente[] = new Cliente[quantidade];
        Manipular controller = new Manipular();
        
        controller.cadastro(cliente, quantidade);
        controller.listar(cliente, quantidade);
        System.out.println("Genero Masculino: ");
        controller.generoMasculino(cliente, quantidade);    
        
        System.out.println("Quantidade do Genero Masculino:");
        int dados = controller.somaMasculino(cliente, quantidade);
        System.out.println("numero total do Genero Masculino e: "+dados);
    }
    
}
