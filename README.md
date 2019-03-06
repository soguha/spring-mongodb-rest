# spring-mongodb-rest

Open STS go to File --> Spring Starter Project --> Add Web and MongoDB dependencies.

Create a model class, Repository interface that extends MongoRepository<Person, String> and finally the REST Controller.

GET, PUT, POST, DELETE methods are implemented in the REST Controller.
The different annotations used are @RequestMapping which specifies the base URL that the controller will be handling, @Autowired which helps to create an instance of Project Repository object in the controller class which can be used to modify and save data to the database. @PathVariable is used for POST and PUT and DELETE requests if we are taking in some query parameters to post, put
and delete in the database. @RequestBody and @Valid are used in case of PUT AND POST so that the input given from client is valid and
follows the correct format. @RestController is also used to tell Spring that this class will be requested by URL and it has to return some
data to the one who requests.


Under resources folder there is a file called application.properties where you have to establish mongodb connection with the spring project

spring.data.mongodb.uri= mongodb://localhost:27017/rest_tutorial

The above line is the mongodb url for localhost MongoDB community edition. rest_tutorial is the name of the database.


Postman here acts as the client to implement GET, POST, PUT, DELETE.


