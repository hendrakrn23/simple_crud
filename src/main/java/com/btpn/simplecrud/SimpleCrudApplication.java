package com.btpn.simplecrud;

import com.btpn.persistence.CrudRepository;
import com.btpn.simplecrud.model.Crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
@Import({SpringConfig.class})
@EnableJpaRepositories({"com.btpn.persistence"})
@SpringBootApplication
public class SimpleCrudApplication implements CommandLineRunner{

	@Autowired
	CrudRepository crudRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
		System.out.println("Hello World");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

	@Override
	public void run(String... strings) throws Exception {
		crudRepository.save(new Crud("A", "1"));
		crudRepository.save(new Crud("B", "2"));
		crudRepository.save(new Crud("C", "3"));
	}
}
