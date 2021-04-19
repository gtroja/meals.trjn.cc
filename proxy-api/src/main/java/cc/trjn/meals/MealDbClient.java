package cc.trjn.meals;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.net.http.HttpRequest;

import org.springframework.web.client.HttpClientErrorException.NotFound;

import cc.trjn.meals.model.Meal;

public class MealDbClient {

    private static String mealDbMealURL = "https://www.themealdb.com/api/json/v1/1/lookup.php?i=";
    private static String mealDbSearchURL = "https://themealdb.com/api/json/v1/1/search.php?s=";

    public static Meal getById(Number id){

        //HttpResponse<String> response = HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create(mealDbMealURL + id.toString())), BodyHandlers.ofString());
        return new Meal(
            id,
            "teste",
            "categoria",
            "area",
            "https://www.themealdb.com/images/media/meals/wvpsxx1468256321.jpg",
            "instrucoes"
        );

    }

    public static List<Meal> searchByName(String name){
       // HttpResponse<String> response = HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create(mealDbSearchURL + name)), BodyHandlers.ofString());
        
        return Arrays.asList(
            new Meal(
                1,
                name,
                "categoria",
                "area",
                "https://www.themealdb.com/images/media/meals/wvpsxx1468256321.jpg",
                "instrucoes"
            ),
            new Meal(
                2,
                name + '2',
                "categoria",
                "area",
                "https://www.themealdb.com/images/media/meals/wvpsxx1468256321.jpg",
                "instrucoes"
            ), new Meal(
                3,
                name + '4',
                "categoria",
                "area",
                "https://www.themealdb.com/images/media/meals/wvpsxx1468256321.jpg",
                "instrucoes"
            )


        );
    }

    private static Meal convertToMeal(String input){
        return new Meal();

    }
}