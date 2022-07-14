package ex612;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> manager;
    Random random = new Random();

    public JokeManager() {
        this.manager = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.manager.add(joke);
    }

    public String drawJokes() {
        if (this.manager.isEmpty()) {
            return "Jokes are in short supply.";
        }
        return this.manager.get(random.nextInt(this.manager.size()));
    }

    public void printJokes() {
        if (!this.manager.isEmpty()) {
            for (String joke : manager) {
                System.out.println(joke);
            }
        }
    }
}
