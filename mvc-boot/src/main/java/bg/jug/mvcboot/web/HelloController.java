package bg.jug.mvcboot.web;

import bg.jug.mvcboot.service.GreeterIfc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final GreeterIfc greeter;

  public HelloController(GreeterIfc greeter) {
    this.greeter = greeter;
  }

  @GetMapping("/hello")
  String hello() {
    return greeter.greet();
  }

}
