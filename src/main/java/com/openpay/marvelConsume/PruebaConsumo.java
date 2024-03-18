package com.openpay.marvelConsume;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PruebaConsumo {
	
//	private final WebClient webClient;
	
	public String retornoTexto(String in) {
//		WebClient.builder().baseUrl("https://gateway.marvel.com:443/v1/public/characters?apikey=83a819784ce65b7de75979fe60942b39&ts=14/03/2024,"+
//	                                " 20:09:12&hash=1b4cdfe248960f86d4f7a9c9eee8d05a").build();
		return "Esta es la entrada: "+ in;
	}

}