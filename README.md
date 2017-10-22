# SpringMongoRest

Based on the official Spring tutorial:

https://spring.io/guides/gs/accessing-mongodb-data-rest/

To add 'Person' objects to local DB by curl:

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bob\",  \"lastName\" : \"Carrot\" }" http://localhost:8080/people

To add 'Person' objects to local DB by URL:

http://localhost:8080/addPerson?firstName=someFirstName&lastName=someLastName

To delete 'Person' objects in local DB by URL:

http://localhost:8080/deletePerson?firstName=someFirstName&lastName=someLastName

