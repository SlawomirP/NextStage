package ex610;

import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) { // warunek zatrzymania
                break;
            }
            if (command.equals("add")) { // warunek dodania
                System.out.println("To add:");
                this.todoList.add(scanner.nextLine());
            }
            if (command.equals("list")) { // warunek do wyswietlenia listy
                this.todoList.print();
                }
            if (command.equals("remove")) { // warunek do usuwania z listy
                System.out.println("Which one is removed?");
                this.todoList.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
