package peter.springframework.dependencyinjection.services;

public class VietnameseGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public VietnameseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getVietnameseGreeting();
    }
}
