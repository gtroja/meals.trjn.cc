import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Meal } from '../meal.model'

@Component({
  selector: 'app-meal-modal',
  templateUrl: './meal-modal.component.html',
  styleUrls: ['./meal-modal.component.css']
})
export class MealModalComponent implements OnInit {

  @Input() meal : Meal

  @Input() open : Boolean
  @Output() openChange = new EventEmitter<Boolean>()

  constructor() { }

  ngOnInit(): void {
    
  }

  onCloseModal(){
    this.openChange.emit(false)
  }

}
