package com.cts.Spring_Project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        
    	Player ply=context.getBean("thePlayer",Player.class);
    	
    	ply.work();
    }
}
