package br.com.spring_boot_rocketseat.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.spring_boot_rocketseat")
public class SpringBootRocketseatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRocketseatApplication.class, args);
	}

}
