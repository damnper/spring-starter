package com.yunusov.spring.database.repository;

import com.yunusov.spring.bpp.InjectBean;
import com.yunusov.spring.database.pool.ConnectionPool;

public class CompanyRepository {

    @InjectBean
    private ConnectionPool connectionPool;



}
