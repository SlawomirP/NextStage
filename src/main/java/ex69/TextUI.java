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

    // metoda pytająca i wyswietlajaca, jezeli bedzie polecenie end to konczy
    // petle jezeli add to prosi o slowo i o tlumaczenie a nastepnie wpisuje
    // to w tablice

    public void start() {
        mainloop:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word");
                String word = scanner.nextLine();
                System.out.println("Translation");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }
            if ((!command.equals("end")) || (!command.equals("add"))) {
                System.out.println("Unknown command");
            }
        }
    }
}
