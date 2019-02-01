package peter.springframework.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    public GreetingRepositoryImpl() {
        System.out.println("initializing GreetingRepositoryImpl");
    }

    @Override
    public String getChineseGreeting() {
        return "早上好!";
    }

    @Override
    public String getJapaneseGreeting() {
        return "おはようございます!";
    }

    @Override
    public String getVietnameseGreeting() {
        return "Chào buổi sáng!";
    }
}
