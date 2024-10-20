package springbean_initialization_using_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going to initialize now");
        System.out.println("Do some code");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is going to destroy now");

    }


}
