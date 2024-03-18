package com.openpay.marvelConsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MarvelConsumeApplication {

	public static void main(String[] args) {
		String url ="https://gateway.marvel.com:443/v1/public/characters?apikey=83a819784ce65b7de75979fe60942b39&ts=14/03/2024, 20:09:12&hash=1b4cdfe248960f86d4f7a9c9eee8d05a";
		WebClient.Builder builder = WebClient.builder();
		
		String response = builder.build().get().uri(url).retrieve().bodyToMono(String.class).block();
		
		System.out.println("prueba de funcionamiento   ");
		System.out.println(response);
		SpringApplication.run(MarvelConsumeApplication.class, args);
	}

}
