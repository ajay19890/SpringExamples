package com.ace;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by awadha on 11/2/2016.
 */
public class HelloWorld implements DisposableBean, InitializingBean{

    private String message;

    public HelloWorld(){
        System.out.println("constructor");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(" Aware init");
    }

    public void destroy() throws Exception {
        System.out.println(" Aware destroy");
    }

    public void init(){
        System.out.println("init custom called...");
    }

    public void destroy2(){
        System.out.println("destroy custom called...");
    }

    @PostConstruct
    public void init1(){
        System.out.println("init ann called...");
    }

    @PreDestroy
    public void destroy1(){
        System.out.println("destroy ann called...");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
