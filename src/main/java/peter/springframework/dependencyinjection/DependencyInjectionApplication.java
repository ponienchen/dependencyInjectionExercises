package peter.springframework.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import peter.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import peter.springframework.dependencyinjection.controllers.MyController;
import peter.springframework.dependencyinjection.controllers.PropertyInjectedController;
import peter.springframework.dependencyinjection.controllers.SetterInjectedController;


@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);
        controller.hello();

        PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
        propertyInjectedController.sayGreeting();

        SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
        setterInjectedController.sayGreeting();

        ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
        constructorInjectedController.sayGreeting();
    }
}

