package cc.trjn.meals;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;
import org.json.JSONArray;
import cc.trjn.meals.model.Meal;

public class MealDbClient {

    private static String mealDbSearchURL = "https://themealdb.com/api/json/v1/1/search.php?s=";

    public static List<Meal> searchByName(String name){

        List<Meal> result = new ArrayList<Meal>();
        JSONObject jo = httpGetJson(mealDbSearchURL + URLEncoder.encode(name, StandardCharsets.UTF_8));
        
        if(jo.isNull("meals")) return result;

        JSONArray meals = (JSONArray)jo.get("meals");
        for (int i = 0; i < meals.length(); i++) {
            result.add(new Meal(meals.getJSONObject(i)));                  
        }

        return result;
    }

    private static JSONObject httpGetJson( String url){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return new JSONObject(response.body());
            }
            else{
                return new JSONObject("[]");
            }
            
        }

        catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return new JSONObject("[]");
        }
    }
}