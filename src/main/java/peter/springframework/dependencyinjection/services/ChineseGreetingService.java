package peter.springframework.dependencyinjection.services;

public class ChineseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public ChineseGreetingService(GreetingRepository greetingRepository) {
        System.out.println("initializing ChineseGreetingService");
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        System.out.println("invoking 'sayGreeting' method for ChineseGreetingService class");
        return this.greetingRepository.getChineseGreeting();
    }
}
