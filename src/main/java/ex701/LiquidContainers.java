package ex701;


import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100" + "\n" + "Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (command.equals("add")) {
                if (amount > 0) {
                    if (first + amount > 100) {
                        first = 100;
                    }
                    if (first + amount >= 0 && first + amount <= 100) {
                        first += amount;
                    }
                }
//                System.out.println("First: " + first + "/100" + "\n" + "Second: " + second + "/100");
            }
            if (command.equals("move")) {
                if (amount > 0) {
                    if (amount >= first) {
                        amount = first;
                        if (second + amount > 100) {
                            second = 100;
                            first = 0;
                        }
                        if (second + amount >= 0 && second + amount <= 100) {
                            second += amount;
                            first = 0;
                        }
                    }
                    if (amount < first) {
                        if (second + amount > 100) {
                            second = 100;
                            first -= amount;
                        }
                        if (second + amount >= 0 && second + amount <= 100) {
                            second += amount;
                            first -= amount;
                        }
                    }
                }

//                System.out.println("First: " + first + "/100" + "\n" + "Second: " + second + "/100");
            }
            if (command.equals("remove")) {
                if (amount > 0) {
                    if (amount >= second) {
                        second = 0;
                    }
                    if (amount < second) {
                        second -= amount;
                    }
                }
            }
        }
    }
}
