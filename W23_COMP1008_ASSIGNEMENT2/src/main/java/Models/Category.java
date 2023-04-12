package Models;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Recipe> recipes;

    public Category(String name) {
        this.name = name;
        this.recipes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }
}