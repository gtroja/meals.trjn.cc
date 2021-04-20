package cc.trjn.meals;
import java.util.List;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.trjn.meals.model.Meal;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 360)
@RequestMapping("/api")
public class MealController {

    @GetMapping("/search")
    public ResponseEntity<List<Meal>> getMealsBySearchedName(@RequestParam(value = "name") String name){
        List<Meal> results = MealDbClient.searchByName(name);
        return ResponseEntity.ok().body(results);
    }
    

}