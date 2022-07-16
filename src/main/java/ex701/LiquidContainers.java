package ex701;


import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            if (input.contains("add")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount > 0) {
                    if (first + amount > 100) {
                        first = 100;
                    }
                    if (first + amount >= 0 && first + amount <= 100) {
                        first += amount;
                    }
                }
                System.out.println("First: " + first + "/100" + "\n" + "Second: " + second + "/100");
            }
            if (input.contains("move")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount > 0 && amount < first && first != 0) {
                    if (second + amount > 100) {
                        second = 100;
                        first -= amount;
                    }
                    if (second + amount >= 0 && second + amount <= 100) {
                        second += amount;
                        first -= amount;
                    }
                }
                if (amount > 0 && amount > first && first != 0) {
                    amount -= first;
                    second += amount;
                    first = 0;
                }
                System.out.println("First: " + first + "/100" + "\n" + "Second: " + second + "/100");
            }
        }
    }
}
