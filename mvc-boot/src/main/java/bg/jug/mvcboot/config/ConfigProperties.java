package bg.jug.mvcboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("demo.env")
public class ConfigProperties {

  /**
   * The first name.
   */
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public ConfigProperties setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public ConfigProperties setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
}
