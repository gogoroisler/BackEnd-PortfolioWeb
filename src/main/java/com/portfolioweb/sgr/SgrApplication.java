package com.portfolioweb.sgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgrApplication.class, args);
	}
public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/persona").allowedOrigins("https://portfolio-web-argprog.web.app");
                                registry.addMapping("/explaboral").allowedOrigins("https://portfolio-web-argprog.web.app");
                                registry.addMapping("/educacion").allowedOrigins("https://portfolio-web-argprog.web.app");
                                registry.addMapping("/proyecto").allowedOrigins("https://portfolio-web-argprog.web.app");
                                registry.addMapping("/auth").allowedOrigins("https://portfolio-web-argprog.web.app");
			}
		};
	}
}
