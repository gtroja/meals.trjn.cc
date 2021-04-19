import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Meal } from '../meal.model'


@Component({
  selector: 'app-meal-list',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.css']
})
export class MealListComponent implements OnInit {

  @Input() mealList : Meal[];
  @Output() selectedMeal = new EventEmitter<Meal>();

  constructor() { }

  ngOnInit(): void {
  }

  onClickOnMeal(meal){
    this.selectedMeal.emit(meal)
  }

}
