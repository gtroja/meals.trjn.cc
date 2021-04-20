import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { MealListComponent } from './meal-list/meal-list.component';
import { MealModalComponent } from './meal-modal/meal-modal.component';
import { HttpClientModule } from '@angular/common/http';
import {NglModule} from 'ng-lightning';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    SearchBarComponent,
    MealListComponent,
    MealModalComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NglModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
