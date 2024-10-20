package springbean_initialization_using_interface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext cfa = new ClassPathXmlApplicationContext("springbean_initialization_using_interface.xml");
        cfa.getBean("bean1");
        Thread.sleep(2000);
        cfa.close();
        System.out.println(cfa);
    }
}
