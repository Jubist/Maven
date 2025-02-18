/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 2417109
 */
public class WordCounter {
    
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length; // Sépare les mots en fonction des espaces
    }

    public static void main(String[] args) {
        String text = "Voici un exemple de texte écrit par JUBA";
        System.out.println("Nombre de mots : " + countWords(text));
    }
    
}
