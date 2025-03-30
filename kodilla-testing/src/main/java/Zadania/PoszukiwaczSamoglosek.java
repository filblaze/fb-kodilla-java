package Zadania;

import java.util.*;

public class PoszukiwaczSamoglosek {
    public static void main(String[] args) {

        String word = "Amadeusz";
        List<Character> litery = new ArrayList();

        for (int i=0; i<word.length(); i++) {
            if ("AaEeIiOoUuYy".indexOf(word.charAt(i))> -1) {
                litery.add(word.charAt(i));
            }
        }
        char[] wynik = new char[litery.size()];
        for (int i=0; i<litery.size(); i++) {
            wynik[i]=litery.get(i);
        }
    }
}
