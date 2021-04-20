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

  mealList : Meal[] = null
  selectedMeal : Meal = null

  showTopAlert = false;

  onSearchTermUpdate(term){
    this.mealService.searchMealsByName(term).subscribe(meals=>this.mealList = meals, _=> this.onError())
  }

  onSelectedMealUpdate(meal){
    this.selectedMeal = meal
  }

  onError(){
    this.showTopAlert = true;
  }
}
