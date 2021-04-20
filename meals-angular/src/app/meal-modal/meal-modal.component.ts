import { Component, OnInit, Input } from '@angular/core';
import { Meal } from '../meal.model'

@Component({
  selector: 'app-meal-modal',
  templateUrl: './meal-modal.component.html',
  styleUrls: ['./meal-modal.component.css']
})
export class MealModalComponent implements OnInit {

  @Input() meal : Meal
  ngOnChanges() {
    this.opened = this.meal?true:false;
  }

  opened : boolean = false;

  constructor() { }

  ngOnInit(): void {
    
  }

}
