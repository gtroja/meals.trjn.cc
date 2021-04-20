package cc.trjn.meals;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


import org.json.JSONObject;
import org.json.JSONArray;
import cc.trjn.meals.model.Meal;

public class MealDbClient {

    private static String mealDbSearchURL = "https://themealdb.com/api/json/v1/1/search.php?s=";

    public static List<Meal> searchByName(String name){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(mealDbSearchURL + name)).build();
        
        List<Meal> result = new ArrayList<Meal>();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                JSONObject jo = new JSONObject(response.body());
                if(jo.isNull("meals")) return result;
                JSONArray meals = (JSONArray)jo.get("meals");
                for (int i = 0; i < meals.length(); i++) {
                    JSONObject meal = meals.getJSONObject(i);
                    result.add(
                        new Meal(
                            meal.getNumber("idMeal"),
                            meal.getString("strMeal"),
                            meal.getString("strCategory"),
                            meal.getString("strArea"),
                            meal.getString("strMealThumb"),
                            meal.getString("strInstructions")                           
                        )
                    );                    
                }
            }
            
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
}