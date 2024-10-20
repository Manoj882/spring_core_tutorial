package org.setterInjection;

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
            ApplicationContext context = new ClassPathXmlApplicationContext("setterInjectionConfig.xml");
            Student std1 = (Student) context.getBean("student1");

            Student std2 = (Student) context.getBean("student2");

        System.out.println(std1);

        System.out.println(std2);

    }
}
