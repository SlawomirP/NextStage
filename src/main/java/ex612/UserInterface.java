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
            String decision = scanner.nextLine();
            if (decision.equals("X")) {
                break;
            }
            if(decision.equals("1")){
                System.out.println("Write the joke to be added:");
                this.jokeManager.addJoke(scanner.nextLine());
            }
            if(decision.equals("2")){
                this.jokeManager.drawJokes();
            }
            if(decision.equals("3")){
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
//    public boolean doesItContain (){
//        if(scanner.nextLine().equals("X") || scanner.nextLine().equals("1")
//        || scanner.nextLine().equals("2") || scanner.nextLine().equals("3")){
//            return true;
//        }
//        return false;
//    }
//    public void tenses(String dec){
//        switch (dec) {
//            case "1":
//                System.out.println("Write the joke to be added:");
//            case "3":
//                System.out.println("Printing the jokes.");
//        }
//    }
}
