package peter.springframework.dependencyinjection.services;

public class ChineseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public ChineseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getChineseGreeting();
    }
}
