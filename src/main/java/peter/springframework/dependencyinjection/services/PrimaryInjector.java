package peter.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service makes this a Spring Bean, which then can be managed by ApplicationContext for auto-wiring purposes
@Service
//@Primary makes this the primary bean to use in case there are > 1 beans
//@Primary
public class PrimaryInjector implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - PrimaryInjector!!!";
    }
}
