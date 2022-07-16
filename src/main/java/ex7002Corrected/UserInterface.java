package ex7002Corrected;

import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface() {
        this.first = new Container();
        this.second = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("First: " + first.toString() + "\n" + "Second: " + second.toString());

            String userCommand = scanner.nextLine();

            if (userCommand.equals("quit")) {
                break;
            }

            String[] userCommandSplit = userCommand.split(" ");
            String command = userCommandSplit[0];
            int amount = Integer.parseInt(userCommandSplit[1]);

            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                first.remove(amount);
                second.add(amount);
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }

}
