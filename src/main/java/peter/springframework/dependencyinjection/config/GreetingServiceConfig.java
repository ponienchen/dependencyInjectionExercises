package peter.springframework.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import peter.springframework.dependencyinjection.services.GreetingRepository;
import peter.springframework.dependencyinjection.services.GreetingService;
import peter.springframework.dependencyinjection.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        System.out.println("about to initialize GreetingServiceFactory");
        return new GreetingServiceFactory(repository);
    }

    // Spring will auto-wire the above Bean "GreetingServiceFactory" into the argument variable
    @Bean
    @Primary
    @Profile({"default", "zh"})
    GreetingService chineseGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("zh");
    }

    // Spring will auto-wire the above Bean "GreetingServiceFactory" into the argument variable
    @Bean
    // @Primary
    @Profile("jp")
    GreetingService japaneseGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("jp");
    }

    // Spring will auto-wire the above Bean "GreetingServiceFactory" into the argument variable
    @Bean
    // @Primary
    @Profile("vi")
    GreetingService vietnameseGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("vi");
    }
}
