# trjn's MealDB client

## what?
 this is the repository for https://meals.trjn.cc web app. It is a simple webpage that lets the user search meals by name in the [MealsDB](https://www.themealdb.com/) data base, and view its details. this repository contais both the frontend and backend source code

## why?
this is a test for a fullstack developer position at TOPi. The test description can be found at [requirements.md](./requirements.md)


## how..
### ..do I use it?
Go to https://meals.trjn.cc and type a meal's name in the searchbox located at the top of the page. If there are matches, a list of meals will appear. Click on a meal entry to view its details.


### ..is't made?

this system is made using [SpringBoot Java Framework](https://spring.io/projects/spring-boot) for the backend and [Angular](https://angular.io/) for the frontend. The system is hosted at [Heroku](heroku.com). 

The `meals-angular` directory contains the source for the front-end. Further details can be found at [README.md](./meals-angular/README.md)

Most of the backend logic can be found at [MealDbClient.java](src/main/java/cc/trjn/meals/MealDbClient.java).
When [MealController.java](src/main/java/cc/trjn/meals/MealController.java) receives a HTTP GET request to the http(s)://meals.trjn.cc/api/search?name=query endpoint with the `name` parameter, it gets its value and calls MealDB api to get the results. Note that it doesn't store anything. Receiving an Array of meals, it formats the result and returns as a json array of meal objects, following the format:
```
    id : string,
    name : string,
    area : string,
    thumbnail : string,
    cookingInstructions : string
```
if there's an error getting the meals, or there're no matches it returns an empty array.

### ..do I run it locally?

you will need to have Java runtime 11, Maven, Nodejs, Npm and the Angular CLI installed.

to build and run the frontend see [meals-angular/README.md](./README.md). You can run a developer live server which will serve the webpage in http://localhost:4200 or you can build and copy the generated files in `meals-angular/dist` to `src/main/resources/public` and let the api server serve it in http://localhost:8080


To build the backend project run:
`mvn clean install`. Maven will download all dependencies, build the project and test it. [ProxyApiApplicationTests.java](src/test/java/cc/trjn/meals/ProxyApiApplicationTests.java) describes the tests:
First it tests if it could built an Meal object from a MealDB json-formmated meal object, then it tests if, from where the project is being built, it could access MealDB's api.
to run the server simply execute the jar generated in `/target` directory: 
`java -jar target/proxy-api-0.0.1-SNAPSHOT.jar`. If everything goes right the service will be avaiable at http://localhost:8080/api/

currently the deployment to heroku is integrated to github, but it is being done manually.

## what's next?

it would be great to :
- automate the packaging (build the front and put it in the file server) and deployment
- implement frontend tests
- animations

## who?
This webapp was made by Guilherme Trojan. contact me by email via guilhermetrojan [at] alunos [dot]  utfpr.edu.br or guilhermetrojan [at] gmail.com
