package bg.jug.mvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class MvcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBootApplication.class, args);
	}

}
