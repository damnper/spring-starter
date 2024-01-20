package com.yunusov.spring;

import com.yunusov.spring.database.pool.ConnectionPool;
import com.yunusov.spring.database.repository.CompanyRepository;
import com.yunusov.spring.database.repository.UserRepository;
import com.yunusov.spring.ioc.Container;
import com.yunusov.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);
//        var userService = container.get(UserRepository.class);
    }

}
