package EX7_07;

public class Recipe {
    private String name;
    private int cookingTime;
    private String ingredient;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    public Recipe(String name, int cookingTime, String ingredient) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String toString(){
        return this.name + ", cookingtime: " + this.cookingTime;
    }
}
