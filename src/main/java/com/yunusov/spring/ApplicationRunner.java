package com.yunusov.spring;

import com.yunusov.spring.database.pool.ConnectionPool;
import com.yunusov.spring.database.repository.CompanyRepository;
import com.yunusov.spring.database.repository.UserRepository;
import com.yunusov.spring.ioc.Container;
import com.yunusov.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);
    }

}
