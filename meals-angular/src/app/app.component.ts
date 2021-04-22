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
  showMealModal = false;

  ngOnInit() {
    this.mealService.searchMealsByName("").subscribe(meals=>this.mealList = meals, _=> this.onError())
  }

  onSearchTermUpdate(term){
    this.mealService.searchMealsByName(term).subscribe(meals=>this.mealList = meals, _=> this.onError())
  }

  onSelectedMealClick(meal){
    this.selectedMeal = meal
    this.showMealModal = true
  }

  onError(){
    this.showTopAlert = true;
  }
}
