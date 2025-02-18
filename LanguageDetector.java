/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 2417109
 */
public class LanguageDetector {
    
    public static String detectLanguage(String text) {
        if (text == null || text.isEmpty()) {
            return "Inconnu";
        }

        // Détection simple basée sur la présence d'accents
        if (text.matches(".*[àéèêëîïôûüç abcdefghijklmnopqrstuv].*")) {
            return "Français";
        } else {
            return "Inconnu";
        }
    }

    public static void main(String[] args) {
        String text = "Bonjour, comment ça va ?";
        System.out.println("Langue détectée : " + detectLanguage(text));
    }
    
}
