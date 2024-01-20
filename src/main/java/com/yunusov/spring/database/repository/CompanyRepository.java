package com.yunusov.spring.database.repository;

import com.yunusov.spring.database.pool.ConnectionPool;

public class CompanyRepository {

    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {

        this.connectionPool = connectionPool;
    }
}
