# SpringMongoRest

Based on the official Spring tutorial:

https://spring.io/guides/gs/accessing-mongodb-data-rest/

To add 'Person' objects to local DB by curl:

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bob\",  \"lastName\" : \"Carrot\" }" http://localhost:8080/people

To view all 'Person' objects in local BD by URL:

http://localhost:8080/readDBPersonObjects

To add 'Person' objects to local DB by URL:

http://localhost:8080/addPerson?firstName=someFirstName&lastName=someLastName

To delete 'Person' objects in local DB by URL:

http://localhost:8080/deletePerson?firstName=someFirstName&lastName=someLastName


### Mongo local config (src/main/resources/application.properties)

Alter the below according to your needs, in my example I'm defaulting to localhost:27017 and setting only the DB Name in this file

spring.data.mongodb.host=hostname

spring.data.mongodb.port=27017 

spring.data.mongodb.database=dbname

spring.data.mongodb.username=username

spring.data.mongodb.password=******