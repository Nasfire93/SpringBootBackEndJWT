import Config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({ SecurityConfig.class })
@SpringBootApplication
public class BitboxApplication {
	public static void main(String[] args) {
		SpringApplication.run(BitboxApplication.class, args);
	}
}
