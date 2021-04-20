import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Meal } from './meal.model'
import { Observable } from 'rxjs';
import { environment } from '../environments/environment'

@Injectable({
  providedIn: 'root'
})

export class MealService {

  private apiURL = environment.apiUrl;

  constructor (private http: HttpClient) { }

  searchMealsByName(name : string):Observable<Meal[]>{
    return this.http.get<Meal[]>(this.apiURL + "/search?name=" + name)
  }
  
}
