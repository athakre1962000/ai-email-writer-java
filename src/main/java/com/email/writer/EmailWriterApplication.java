package com.email.writer;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailWriterApplication {

	static {
		try {
			Dotenv dotenv = Dotenv.configure()
					.directory("./")
					.ignoreIfMalformed()
					.ignoreIfMissing()
					.load();
			
			// Set system properties from .env file
			dotenv.entries().forEach(entry -> {
				if (System.getProperty(entry.getKey()) == null) {
					System.setProperty(entry.getKey(), entry.getValue());
				}
			});
		} catch (Exception e) {
			System.out.println("Warning: Could not load .env file: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailWriterApplication.class, args);
	}

}
