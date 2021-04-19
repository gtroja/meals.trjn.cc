import { Component } from '@angular/core';
import { Meal } from './meal.model';
import { MealService } from './meal.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  constructor(private mealService: MealService) {}

  mealList : Meal[] = [ {id : 1,name : "nome 1",area : "area 1", category : "category 1", cookingInstructions :"cookingInstructions 2", thumbnail :"404"} ]
  selectedMeal : Meal = null

  onSearchTermUpdate(term){
    this.mealService.searchMealsByName(term).subscribe(meals=>this.mealList = meals)
  }

  onSelectedMealUpdate(meal){
    this.selectedMeal = meal
  }
}
