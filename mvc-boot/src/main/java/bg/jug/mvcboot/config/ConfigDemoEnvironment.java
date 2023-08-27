package bg.jug.mvcboot.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ConfigDemoEnvironment {

  private final Logger LOGGER = LoggerFactory.getLogger(ConfigDemoEnvironment.class);

  private final Environment environment;

  public ConfigDemoEnvironment(Environment environment) {
    this.environment = environment;
  }

  @PostConstruct
  void postConstruct() {

    String firstName = environment.getProperty("demo.env.firstName");
    String lastName = environment.getProperty("demo.env.lastName");

    LOGGER.info("First name: {}, Last name: {}",  firstName, lastName);
  }
}
