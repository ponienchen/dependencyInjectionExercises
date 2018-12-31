package peter.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import peter.springframework.dependencyinjection.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingServiceImpl(@Qualifier("anotherGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayGreeting() {
        System.out.format("SetterInjected: %s\n", greetingService.sayGreeting());
    }
}