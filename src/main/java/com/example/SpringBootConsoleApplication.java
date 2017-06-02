package com.example;

import com.example.business.Greeting;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	private Greeting greeting;
	
	@Value("${user}")
	private String user;
	
    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {

		System.out.println(greet());
        System.out.println(greeting.greet());

    }
	
	public String greet() {
        StringBuilder hello = new StringBuilder("Hola, soy ")
			.append(user)
			.append(", te saludo desde el programa principal ")
			.append(user)
			.append("!");
        return hello.toString();
    }
}
