/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 2417109
 */
public class SentimentAnalyzer {
    
    public static String analyzeSentiment(String text) {
        
        if (text == null || text.isEmpty()) {
            return "Neutre";
        }

        String[] positiveWords = {"heureux", "joyeux", "excellent", "positif"};
        String[] negativeWords = {"triste", "malheureux", "mauvais", "négatif"};

        int positiveScore = 0;
        int negativeScore = 0;

        for (String word : text.toLowerCase().split("\\s+")) {
            for (String pos : positiveWords) {
                if (word.equals(pos)) {
                    positiveScore++;
                }
            }
            for (String neg : negativeWords) {
                if (word.equals(neg)) {
                    negativeScore++;
                }
            }
        }

        if (positiveScore > negativeScore) {
            return "Positif";
        } else if (negativeScore > positiveScore) {
            return "Négatif";
        } else {
            return "Neutre";
        }
    }

    public static void main(String[] args) {
        String text = "Je suis de bonne humeur aujourd'hui";
        System.out.println("Analyse de sentiment : " + analyzeSentiment(text));
    }
    
}
