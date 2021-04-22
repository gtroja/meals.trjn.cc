import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Meal } from '../meal.model'

@Component({
  selector: 'app-meal-list',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.css']
})
export class MealListComponent implements OnInit {

  start : number = 0
  end : number = 0
  perPage : number = 5

  @Input() mealList : Meal[]

  @Output() selectedMeal = new EventEmitter<Meal>();

  constructor() {}

  ngOnInit(): void {
  }

  onPageChange(page){
    //done like this because NglPagination start and end properties are bad behavings
    let p  = Number(page)
    this.start = (p-1)*this.perPage
    this.end = (p)*this.perPage
  }

  onClickOnMeal(meal){
    this.selectedMeal.emit(meal)
  }

}
