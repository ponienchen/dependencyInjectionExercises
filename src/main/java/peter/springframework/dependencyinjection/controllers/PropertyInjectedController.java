package peter.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import peter.springframework.dependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;

    public void sayGreeting() {
        System.out.format("PropertyInjected %s\n", greetingService.sayGreeting());
    }
}
