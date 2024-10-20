package springbean_initialization_using_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

    @PostConstruct
    public void init(){
        System.out.println("Initializing spring bean using annotation");
        System.out.println("Do sum code");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying spring bean using annotation");
    }
}
