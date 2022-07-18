package EX7_07;

import java.util.ArrayList;

public class RecipeListCreator {
    private ArrayList<Recipe> recipes;

    public RecipeListCreator(){
        this.recipes = new ArrayList<Recipe>();
    }

    public void add (Recipe recipe){
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getList (){
        return this.recipes;
    }
    public int getSize(){
        return this.recipes.size();
    }

    public void printList(){
        for(Recipe recipe : this.recipes){
            System.out.println(recipe);
        }
    }

}
