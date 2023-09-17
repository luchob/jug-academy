package eu.balev.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) {

    XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
    webApplicationContext.setConfigLocation("classpath:application-config.xml");

    // Creating a dispatcher servlet object
    DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

    // Registering Dispatcher Servlet with Servlet
    // Context
    ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet(
        "myDispatcherServlet", dispatcherServlet);

    // Setting load on startup
    myCustomDispatcherServlet.setLoadOnStartup(1);

    // Adding mapping url (Custom URL)
    myCustomDispatcherServlet.addMapping("/example/*");

    System.out.println("Dispatcher Servlet is registered successfully.");
  }
}