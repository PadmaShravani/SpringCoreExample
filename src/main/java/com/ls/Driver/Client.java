package com.ls.Driver;

import com.ls.Config.AppConfig;
import com.ls.bean.DBConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args)
    {
        //create an object to ApplicationContext
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

        DBConnection bean = ac.getBean("con",DBConnection.class);
        bean.sum();
        bean.add();
        //stop the container.
        ac.stop();

    }

}
