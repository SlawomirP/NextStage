package ex612;

public class Main {
    public static void main(String[] args) {
        JokeManager test = new JokeManager();
        test.addJoke("What is red and smells of blue paint? - Red paint.");
        test.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(test.drawJokes());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        test.printJokes();
    }
}
