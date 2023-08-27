package bg.jug.mvcboot.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConfigDemoConfigProperties {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConfigDemoConfigProperties.class);
  private final ConfigProperties configProperties;

  public ConfigDemoConfigProperties(ConfigProperties configProperties) {

    this.configProperties = configProperties;
  }

  @PostConstruct
  void init() {
    LOGGER.info("First name {}, Last name {}",
        configProperties.getFirstName(),
        configProperties.getLastName());
  }
}
