package peter.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class AnotherGreetingServiceImpl implements GreetingService {

    private static final String HELLO_GURUS = "Hello AnotherOne!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
