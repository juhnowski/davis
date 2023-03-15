package ru.kerzhenskiy.meteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("ru.kerzhenskiy.meteo.*")
@ComponentScan(basePackages = { "ru.kerzhenskiy.meteo.*" })
@EntityScan("ru.kerzhenskiy.meteo.*")   
@SpringBootApplication(scanBasePackages = "ru.kerzhenskiy.meteo.*")
public class MeteoApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/meteo");
		SpringApplication.run(MeteoApplication.class, args);
	}

}
