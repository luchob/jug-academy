package bg.jug.mvcboot.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDemoValue {
  private final Logger LOGGER = LoggerFactory.getLogger(ConfigDemoValue.class);
  private final String firstName;
  private final String lastName;

  public ConfigDemoValue(
      @Value("${demo.env.firstName}") String firstName,
      @Value("${demo.env.lastName}") String lastName) {

    this.firstName = firstName;
    this.lastName = lastName;
  }

  @PostConstruct
  void postConstruct() {
    LOGGER.info("First name: {}, Last name: {}.",  firstName, lastName);
  }
}