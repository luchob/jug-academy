package bg.jug.mvcboot.gson;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GsonTest implements CommandLineRunner {

  private final Gson gson;

  public GsonTest(Gson gson) {
    this.gson = gson;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(gson.toJson(new Person("L", "Balev")));
  }

  record Person(String firstName, String lastName) {
  }

}
