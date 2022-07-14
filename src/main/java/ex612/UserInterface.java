package ex612;

import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;
    

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            communicate();
            if (doesItContain("X")) {
                break;
            }
            if(doesItContain("1")){
                tenses("1");
                this.jokeManager.addJoke(scanner.nextLine());
            }
            if(doesItContain("2")){
                this.jokeManager.drawJokes();
            }
            if(doesItContain("3")){
                this.jokeManager.printJokes();
            }
        }
    }

    public void communicate() {
        System.out.println("Commands:" + "\n"
                + "1 - add a joke" + "\n"
                + "2 - draw a joke" + "\n"
                + "3 - list jokes" + "\n"
                + "X - stop");
    }
    public boolean doesItContain (String word){
        if(scanner.nextLine().equals(word)){
            return true;
        }
        return false;
    }
    public void tenses(String word){
        switch (word) {
            case "1":
                System.out.println("Write the joke to be added:");
            case "3":
                System.out.println("Printing the jokes.");
        }
    }
}
