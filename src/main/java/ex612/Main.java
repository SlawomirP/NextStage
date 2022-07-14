package ex612;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JokeManager jokeManager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface test = new UserInterface(jokeManager,scanner);

        test.start();
    }
}
