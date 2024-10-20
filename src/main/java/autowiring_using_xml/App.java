package autowiring_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring_using_xml.xml");

        // Autowiring using byName
        Employee employee1 = (Employee) context.getBean("emp1");
        System.out.println(employee1);

        // Autowiring using byType
//        Employee employee2 = (Employee) context.getBean("emp2");
//        System.out.println(employee2);

        // Autowiring using constructor
        Employee employee3 = (Employee) context.getBean("emp3");
        System.out.println(employee3);

    }
}
