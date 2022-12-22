package com.itc.jdbctojpa;

import com.itc.jdbctojpa.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcToJpaApplication implements CommandLineRunner {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJdbcDao dao;
    public static void main(String[] args) {
        SpringApplication.run(JdbcToJpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}",dao.findAll());
        logger.info("User id 10002 -> {}", dao.findById(10002));
        logger.info("User name HERA -> {}", dao.findByName("HERA"));
        logger.info("Location Cingambul -> {}", dao.findByLocation("CINGAMBUL"));
    }
}
