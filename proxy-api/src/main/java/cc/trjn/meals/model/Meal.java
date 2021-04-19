package cc.trjn.meals.model;

public class Meal {

    private Number id;
    private String name;
    private String category;
    private String area;
    private String thumbnail;
    private String cookingInstructions;


    public Meal(){
    }

    public Meal(
        Number id,
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

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
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

