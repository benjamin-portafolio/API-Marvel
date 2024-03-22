package com.openpay.marvelConsume;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import com.openpay.service.ConsumoApiMarvelBI;

@SpringBootApplication
@RestController
public class MarvelConsumeApplication {
	
	@Autowired
	Interfaz dependencia;
	

	public String test() {
		return dependencia.metodo();
	}
	
	 @GetMapping(value = "/")
	 public String holaMundo(){
	        return dependencia.metodo();
	 }

	public static void main(String[] args) {
//		String url ="https://gateway.marvel.com:443/v1/public/characters?apikey=83a819784ce65b7de75979fe60942b39&ts=14/03/2024, 20:09:12&hash=1b4cdfe248960f86d4f7a9c9eee8d05a";
//		WebClient.Builder builder = WebClient.builder();
//		
//		String response = builder.build().get().uri(url).retrieve().bodyToMono(String.class).block();
//		
//		System.out.println("prueba de funcionamiento   ");
//		System.out.println(response);
	
		
		SpringApplication.run(MarvelConsumeApplication.class, args);
	}

}
