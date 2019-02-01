package peter.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import peter.springframework.dependencyinjection.services.GreetingService;
import peter.springframework.dependencyinjection.services.PrimaryInjector;

// Note that this Controller folder needs to be in the same folder as the
// @SpringBootApplication-annotated class. Otherwise, this bean will not be
// found by SpringBoot.
@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        System.out.println("Initializing MyController");
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println(greetingService.sayGreeting());
        return "foo";
    }
}
