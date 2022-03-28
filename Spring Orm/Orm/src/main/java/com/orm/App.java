package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.Studentdao;
import com.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Studentdao d=context.getBean("Dao",Studentdao.class);
        Student st=new Student(100,"Karan","Indore");
        int i=d.insert(st);
        if(i>0)
        {
        	System.out.println("Done");
        }
    }
}
