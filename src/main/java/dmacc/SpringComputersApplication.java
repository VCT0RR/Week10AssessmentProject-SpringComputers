package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.Details;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
	
	//@Autowired
	//ComputerRepository repo;
	 
	/*@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setRetailPrice("$849.49");
		repo.save(c);
		
		Computer i = new Computer("iBUYPOWER", "SlateMESH Gaming Desktop", "$1299.99");
		Details d = new Details("NVIDIA GeForce RTX 3060", "Intel i7-12700F", "1TB HDD");
		
		i.setDetails(d);
		repo.save(i);
		
		List<Computer> allMyComputers = repo.findAll();
		for(Computer items : allMyComputers) {
			System.out.println(items.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}*/
		
	
	

}
