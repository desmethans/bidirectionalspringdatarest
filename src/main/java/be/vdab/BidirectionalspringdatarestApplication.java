package be.vdab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import be.vdab.entities.Person;
import be.vdab.repositories.PersonRepository;

@SpringBootApplication
public class BidirectionalspringdatarestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BidirectionalspringdatarestApplication.class, args);
    }
    
    @Autowired
    PersonRepository personRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		Person person=new Person();
		person.setFirstName("Hans");
		person.setLastName("Desmet");
		personRepository.save(person);
		
		
	}
}
