package EX7_07;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PanelForUser {

    private StringListCreator list;
    private RecipeListCreator recipes;
    Scanner scanner;
    private String recipeFile = "src/recipes.txt";


    public PanelForUser() {
        this.list = new StringListCreator();
        this.recipes = new RecipeListCreator();
        this.scanner = new Scanner(System.in);
//        try {
//            this.reader = new Scanner(Paths.get(recipeFile));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    //---- METODA START

    public void start() {
        System.out.println("File to read:");
        try {
            Scanner reader = new Scanner(Paths.get(scanner.nextLine()));
            while (reader.hasNextLine()) {
                String row = reader.nextLine();


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list.printList();
        System.out.println("Commands:" + "\n"
                + "list - lists the recipes \n"
                + "stop - stops the program \n"
                + "\n"
                + "Enter command: ");


    }
}

