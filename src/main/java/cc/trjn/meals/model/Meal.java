package cc.trjn.meals.model;

import org.json.JSONObject;

public class Meal {

    private String id;
    private String name;
    private String category;
    private String area;
    private String thumbnail;
    private String cookingInstructions;


    public Meal(){
    }

    public Meal( JSONObject json ){
        this.id = json.getString("idMeal");
        this.name = json.getString("strMeal");
        this.category = json.getString("strCategory");
        this.area = json.getString("strArea");
        this.thumbnail = json.getString("strMealThumb");
        this.cookingInstructions = json.getString("strInstructions");     
    }

    public Meal(
        String id,
        String name,
        String category,
        String area,
        String thumbnail,
        String cookingInstructions
    ){
        this.id = id;
        this.name = name;
        this.category = category;
        this.area = area;
        this.thumbnail = thumbnail;
        this.cookingInstructions = cookingInstructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCookingInstructions() {
        return cookingInstructions;
    }

    public void setCookingInstructions(String cookingInstructions) {
        this.cookingInstructions = cookingInstructions;
    }


    
}

