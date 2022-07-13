package ex69;

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translation;

    public SimpleDictionary() {

        this.translation = new HashMap<>();
    }

    public String translate(String word) {
        return this.translation.get(word);
    }

    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }
}
