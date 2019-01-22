package peter.springframework.dependencyinjection.services;

public class JapaneseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public JapaneseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getJapaneseGreeting();
    }
}
