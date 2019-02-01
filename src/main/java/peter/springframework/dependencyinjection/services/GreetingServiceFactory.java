package peter.springframework.dependencyinjection.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        System.out.println("initializing GreetingServiceFactory");
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "zh":
                System.out.println("Returning ChineseGreetingService");
                return new ChineseGreetingService(this.greetingRepository);
            case "jp":
                return new JapaneseGreetingService(this.greetingRepository);
            case "vi":
                return new VietnameseGreetingService(this.greetingRepository);
            default:
                return new ChineseGreetingService(this.greetingRepository);
        }

    }

}
