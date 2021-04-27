package config;

import SpringSecurity.WebSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({ WebSecurity.class })
@SpringBootApplication
public class BitboxApplication {
	public static void main(String[] args) {
		SpringApplication.run(BitboxApplication.class, args);
	}
}
