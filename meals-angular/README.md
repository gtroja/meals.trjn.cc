# MealsAngular

This is the front-end for the trjn's MealdDb client. The [app](src/app/app.component.html) is composed of a search-bar, a results list with pagination bar and a modal with meals details. It also has an alert bar if it fails to get the meals.

Once the [app](src/app/app.component.ts) loads it fetches a random list of meals. When a meal name is entered in the [search bar](src/app/search-bar/), the app fetches meals using the input given. As soon as the user stops typing the request is made. Once the [service](src/app/meal.service.ts) returns the results, the meal list is passed to the [meal list component](src/app/meal-list).This component show 5 meals at a time and a pagination menu provided by the [NG-LIGHTNING](http://ng-lightning.github.io/ng-lightning/) module. When a meal card is clicked, a [meal object](src/app/meal.model.ts) is passed to the [meal modal component](src/app/meal-modal/) to be shown.

This app uses [Lightning Design System](https://www.lightningdesignsystem.com/) styling provided by the [NG-LIGHTNING](http://ng-lightning.github.io/ng-lightning/) module 

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 11.2.9.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.
