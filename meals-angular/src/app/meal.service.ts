import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Meal } from './meal.model'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class MealService {

  private apiURL = "http://localhost:8080/api"

  constructor (private http: HttpClient) { }

  searchMealsByName(name : string):Observable<Meal[]>{
    return this.http.get<Meal[]>(this.apiURL + "/search?name=" + name)
  }

  getMealById(id : number):Observable<Meal>{
    return this.http.get<Meal>(this.apiURL + "/meal/" + id)
  }
  


}
