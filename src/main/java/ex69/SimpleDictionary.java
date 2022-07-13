package ex69;

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translation;

    // konstruktor dodaje nowa haszmape
    public SimpleDictionary() {
        this.translation = new HashMap<>();
    }

    // pobiera wartosc znajdujaca sie pod kluczem
    public String translate(String word) {
        return this.translation.get(word);
    }

    // dodaje klucz i wartosc
    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }
    // moja metoda sprawdzajaca czy w mapie jest okreslony klucz
    public boolean contains(String word) {
        if (translation.containsKey(word)) {
            return true;
        }
        return false;
    }
}
