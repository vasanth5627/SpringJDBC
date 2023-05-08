package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("My program Started");
        //Spring jdbc=> jdbc Template

       ApplicationContext context = new ClassPathXmlApplicationContext("File:///Users/vasanthkumar/IdeaProjects/SpringJDBC/src/main/java/org/example/Config.xml");
       JdbcTemplate jdbcTemplate = context.getBean("jbdcTemplate", JdbcTemplate.class);

       //insert query

        String sql  = "insert into student(id,name,city) values(?,?,?)";

        //fire the query

       int result =  jdbcTemplate.update(sql,222,"Kumar","Vizag");
        System.out.println("Number of result updated "+result);

    }
}