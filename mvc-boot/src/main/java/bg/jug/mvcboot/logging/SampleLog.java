package bg.jug.mvcboot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleLog implements CommandLineRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(SampleLog.class);
  @Override
  public void run(String... args) throws Exception {
    LOGGER.trace("LOG TRACE");
    LOGGER.debug("LOG DEBUG");
    LOGGER.info("LOG INFO");
    LOGGER.warn("LOG WARN");
    LOGGER.error("LOG ERROR");
  }
}
