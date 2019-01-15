package com.min.rabbitmq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.rabbitmq.api.Person;
import com.min.rabbitmq.api.RemoteService;

public class TestRPCClient {
	    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        RemoteService service=(RemoteService) context.getBean("client");
        String object = new String("ni hao haha rpc");
        String result = service.say(object);
        System.out.println(result);
        
        Person person = new Person();
        person.setName("lily");
        Person personCh = service.name(person);
        System.out.println(personCh.getName());
        
        context.close();
	}
}
