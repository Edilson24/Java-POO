package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipadorSwing extends JFrame {
    private JButton selecionarBtn;

    public ZipadorSwing() {
        setTitle("Zipador de Ficheiro");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        selecionarBtn = new JButton("Selecionar Ficheiro");
        selecionarBtn.addActionListener(this::selecionarFicheiro);
        add(selecionarBtn);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    private void selecionarFicheiro(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File ficheiroSelecionado = fileChooser.getSelectedFile();
            try {
                // Nome do ZIP de saída
                File zipFile = new File(ficheiroSelecionado.getParent(), ficheiroSelecionado.getName() + ".zip");
                ziparFicheiro(ficheiroSelecionado, zipFile);
                JOptionPane.showMessageDialog(this, "Ficheiro zipado com sucesso:\n" + zipFile.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao zipar ficheiro: " + ex.getMessage());
            }
        }
    }

    private void ziparFicheiro(File ficheiro, File zipSaida) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(zipSaida);
                ZipOutputStream zos = new ZipOutputStream(fos);
                FileInputStream fis = new FileInputStream(ficheiro)
        ) {
            ZipEntry zipEntry = new ZipEntry(ficheiro.getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int bytesLidos;
            while ((bytesLidos = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesLidos);
            }

            zos.closeEntry();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ZipadorSwing::new);
    }
}

