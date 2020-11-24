package com.example.MongoDemo.MongoDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.MongoDemo.MongoDemo.Entity.MongoEntity1;
import com.example.MongoDemo.MongoDemo.Repository.MongoRepo;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/mongoapi1")
public class MongoController {
	
	WebClient webClient=WebClient.builder().baseUrl("http://localhost:8095/mongoapi").defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();
	
	

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	
	
	@Autowired
	private MongoRepo mongoRepo; 
	
//	@Scheduled(fixedRate=60*60)
//	@RequestMapping("/getall")
//	public String getAll(){
//		
//	MongoEntity mongo=webClientBuilder.build()
//		.get()
//		.uri("http://localhost:8095/mongoapi/findAll")
//		.retrieve()
//		.bodyToMono(MongoEntity.class)
//		.block();
//		
////	MongoEntity mongo=webclient.get().uri("http://localhost:8095/mongoapi/findAll").header(getAll(), null);
//		System.out.println(mongo.getName());	
//		
//		return mongo.getName();
//		
//		
//	}
	
	@GetMapping("/getall")
	public Flux<MongoEntity1> getaall(){
		
		return webClient.get().uri("/findAll").retrieve().bodyToFlux(MongoEntity1.class);
		
	}
	
	
	
	
}
