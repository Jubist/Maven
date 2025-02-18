/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 2417109
 */
public class TextAnalyzer {
    
    public static void main(String[] args) {
        
        String text = "Voici un exemple de texte écrit par un Kelly heureux";

        System.out.println("Nombre de mots : " + WordCounter.countWords(text));
        System.out.println("Analyse de sentiment : " + SentimentAnalyzer.analyzeSentiment(text));
        System.out.println("Langue détectée : " + LanguageDetector.detectLanguage(text));
    }
    
}
