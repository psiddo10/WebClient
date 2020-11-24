package com.example.MongoDemo.MongoDemo.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.MongoDemo.MongoDemo.Entity.MongoEntity1;
import com.example.MongoDemo.MongoDemo.Repository.MongoRepo;


@EnableMongoRepositories(basePackageClasses = MongoRepo.class)
@Configuration
public class MongoConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(MongoRepo mongoRepo) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				mongoRepo.save(new MongoEntity1(1,"sid","team1",1000L));
				mongoRepo.save(new MongoEntity1(2,"shri","team2",1000L));

				
			}
			
		
		};

}
}
