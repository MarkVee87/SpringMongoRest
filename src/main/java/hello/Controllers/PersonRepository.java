package hello.Controllers;

import hello.Models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// automatically creates an endpoint at /people for you
// To add a person to DB by curl:
//curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people
//curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bob\",  \"lastName\" : \"Carrot\" }" http://localhost:8080/people

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("name") String name);
}


