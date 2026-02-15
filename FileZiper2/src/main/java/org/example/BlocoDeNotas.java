package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BlocoDeNotas extends JFrame {
    private JTextArea areaDeTexto;
    private JFileChooser seletorDeArquivo = new JFileChooser();
    private File arquivoAtual = null;

    public BlocoDeNotas() {
        super("Bloco de Notas");

        // Área de texto
        areaDeTexto = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaDeTexto);
        add(scroll, BorderLayout.CENTER);

        // Menu
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem novo = new JMenuItem("Novo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem salvar = new JMenuItem("Salvar");
        JMenuItem sair = new JMenuItem("Sair");

        // Eventos
        novo.addActionListener(e -> {
            areaDeTexto.setText("");
            arquivoAtual = null;
        });

        abrir.addActionListener(e -> {
            if (seletorDeArquivo.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                arquivoAtual = seletorDeArquivo.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(arquivoAtual))) {
                    areaDeTexto.read(br, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir arquivo.");
                }
            }
        });

        salvar.addActionListener(e -> {
            if (arquivoAtual != null) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAtual))) {
                    areaDeTexto.write(bw);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo.");
                }
            } else {
                if (seletorDeArquivo.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    arquivoAtual = seletorDeArquivo.getSelectedFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAtual))) {
                        areaDeTexto.write(bw);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo.");
                    }
                }
            }
        });

        sair.addActionListener(e -> System.exit(0));

        // Montar menu
        menuArquivo.add(novo);
        menuArquivo.add(abrir);
        menuArquivo.add(salvar);
        menuArquivo.addSeparator();
        menuArquivo.add(sair);
        barraMenu.add(menuArquivo);
        setJMenuBar(barraMenu);

        // Configuração final
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BlocoDeNotas::new);
    }
}

