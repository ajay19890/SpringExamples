package com.ace;

import com.ace.factoryMethod.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by awadha on 11/2/2016.
 */
public class MainApp {

    public static void main(String []args){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");

        HelloWorld student = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Message:" + student.getMessage());
        ((FileSystemXmlApplicationContext)context).close();

        /*HelloWorld student2 = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Message:" + student2.getMessage());*/


    }
}
