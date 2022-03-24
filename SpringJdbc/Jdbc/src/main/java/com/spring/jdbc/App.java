package com.spring.jdbc;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import com.spring.dao.StudentImpdao;
import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
StudentDao studentdao=(StudentDao)context.getBean("studentdao");

/*
 * INSERT
Student student=new Student();
student.setId(104);
student.setCity("Gwalior");
student.setName("Anurag");
*/
/*
Student student=new Student();
student.setId(104);
student.setCity("indore");
student.setName("lalbhai");
*/
/*
Student student=new Student();
student.setId(101);
*/


Student result =studentdao.getStudent(104);
System.out.print(result);





}
}
