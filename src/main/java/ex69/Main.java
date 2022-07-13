package ex69;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(simpleDictionary,scanner);

        textUI.start();

        System.out.println(simpleDictionary.translate("kot"));






    }
}
