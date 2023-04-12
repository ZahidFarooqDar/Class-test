package com.example.nationalize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NationalizeApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(NationalizeApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://api.nationalize.io/?name=nathaniel";

		ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.getBody());
		System.out.println("Nationality prediction for the name 'nathaniel':" + "\n" + jsonNode.toPrettyString());
	}

}
