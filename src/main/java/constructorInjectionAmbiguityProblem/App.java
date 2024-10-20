package constructorInjectionAmbiguityProblem;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionAmbiguityProblem.xml");

            Addition addition = (Addition) context.getBean("add");

        System.out.println(addition.doSum());



    }
}
