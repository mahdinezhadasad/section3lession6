package com.udacity.section3lession6;

import com.udacity.section3lession6.entity.InshortNews;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Section3lession6Application {

	private static final Logger log = LoggerFactory.getLogger(Section3lession6Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Section3lession6Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			InshortNews inshortNews = restTemplate.getForObject(
					"https://inshortsapi.vercel.app/news?category=science", InshortNews.class);
			log.info(inshortNews.toString());
		};
	}
}
