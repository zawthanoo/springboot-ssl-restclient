package com.mutu.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		/*
		 * convert crt file to jks
		 * $keytool -import -file <<FILE_PATH>>/local-cert.crt -alias mutu -keystore <<FILE_PATH>>/truststore.jks
		 */
		SpringApplication.run(Application.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		String responseBody1 = restTemplate.getForObject("https://localhost:8888/template/hello", String.class);
		System.out.println("\n\n Using SSL -> " + responseBody1 + "\n\n");
	}
}
