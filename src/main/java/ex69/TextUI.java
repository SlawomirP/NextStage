package ex69;

import java.util.Scanner;

public class TextUI {
    // pola uzywane przez klase
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    // konstruktor
    public TextUI(SimpleDictionary simpleDictionary, Scanner scanner) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    // metoda pytająca i wyswietlajaca

    public void start(Scanner scanner, SimpleDictionary simpleDictionary){
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            System.out.println("Unknown command");
        }
    }
}
