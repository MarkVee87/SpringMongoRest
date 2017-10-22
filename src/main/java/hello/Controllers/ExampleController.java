package hello.Controllers;

import hello.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleController {

    private List<Person> people;

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/mongo")
    public List<Person> mongo() throws IOException {
        people = new ArrayList<>();

        for (Person person : repository.findAll()) {
            people.add(person);
        }
        return people;
    }
}