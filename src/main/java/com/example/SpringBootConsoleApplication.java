package com.example;

import com.example.business.Greeting;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootConsoleApplication.class);
	
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

		LOG.info(greet());
        LOG.info(greeting.greet());

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
