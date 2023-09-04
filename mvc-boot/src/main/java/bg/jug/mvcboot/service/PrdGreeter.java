package bg.jug.mvcboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prd")
@Component
public class PrdGreeter  implements GreeterIfc {

  private final String greeting;

  public PrdGreeter(@Value("${demo.greeting}") String greeting) {

    this.greeting = greeting;
  }
  @Override
  public String greet() {
    return greeting;
  }
}