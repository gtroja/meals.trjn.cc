# trjn's MealDB client

## what?
 this is the repository for https://meals.trjn.cc web app. It is a simple webpage that lets the user search meals by name in the [MealsDB](https://www.themealdb.com/) data base, and view its details. this repository contais both the frontend and backend source code

## why?
this is a test for a fullstack developer position at TOPi. The test description can be found at [requirements.md](./requirements.md)


## how..
### ..do I use it?
Type a meal's name in the searchbox located at the top of the page. If there are matches, a list of meals will appear. Click on a meal entry to view its details.


### ..it's made?

this system is made using [SpringBoot Java Framework](https://spring.io/projects/spring-boot) for the backend and [Angular](https://angular.io/) for the frontend. The system is hosted at [Heroku](heroku.com). 
The `meals-angular` directory contains the source for the front-end and `proxy-api` contains the back-end source. Each directory has a README file with implementation details.

The frontend consumes data from the MealDB's api throught the meals.trjn api, which makes simple http get requests and formats the data received, returning it to the frontend. All meals images shown are hosted by MealsDB.


## what's next?

it would be great to :
- automate the packaging (build the front and put it in the file server) and deployment
- implement frontend tests
- animations
- infinite scrooling


## who?
This webapp was made by Guilherme Trojan. contact me by email via guilhermetrojan [at] alunos [dot]  utfpr.edu.br or guilhermetrojan [at] gmail.com
