package servicos;

import javax.swing.JOptionPane;

public class Autenticao {
    private static final String USUARIO = "admin";
    private static final String SENHA = "admin";
    private static int tentativas = 0;

    public static boolean autenticar() {
        while (tentativas < 3) {
            String usuario = JOptionPane.showInputDialog("Usuário:");
            String senha = JOptionPane.showInputDialog("Senha:");
            
            if (USUARIO.equals(usuario) && SENHA.equals(senha)) {
                return true;
            } else {
                tentativas++;
                JOptionPane.showMessageDialog(null, "Credenciais inválidas. Tentativas restantes: " + (3 - tentativas));
            }
        }
        JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. O sistema será encerrado.");
        System.exit(0);
        return false;
    }
}