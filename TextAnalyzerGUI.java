/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 2417109
 */
public class TextAnalyzerGUI {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Text Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create panel for layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create components
        JTextArea textAreaInput = new JTextArea(5, 40);
        textAreaInput.setWrapStyleWord(true);
        textAreaInput.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textAreaInput);

        JButton analyzeButton = new JButton("Analyser");

        JTextArea textAreaOutput = new JTextArea(10, 40);
        textAreaOutput.setWrapStyleWord(true);
        textAreaOutput.setLineWrap(true);
        textAreaOutput.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(textAreaOutput);

        // Panel to hold the input label and text area
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        JLabel inputLabel = new JLabel("Veuillez entrer un exemple de texte ici ci-dessous :");
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel to hold the output label and text area
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        JLabel outputLabel = new JLabel("Voici le résultat de l'analyse :");
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(outputScrollPane, BorderLayout.CENTER);

        // Button click action to analyze the text
        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textAreaInput.getText();

                String result = "Nombre de mots : " + WordCounter.countWords(text) + "\n";
                result += "Analyse de sentiment : " + SentimentAnalyzer.analyzeSentiment(text) + "\n";
                result += "Langue détectée : " + LanguageDetector.detectLanguage(text);
                
                textAreaOutput.setText(result);
            }
        });

        // Panel to hold the analyze button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(analyzeButton);

        // Add components to the main panel
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(outputPanel, BorderLayout.SOUTH);

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
