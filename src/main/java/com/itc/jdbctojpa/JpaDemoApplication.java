package com.itc.jdbctojpa;


import com.itc.jdbctojpa.entity.Person;
import com.itc.jdbctojpa.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        logger.info("Inserting 10004 -> {} ", repository.insert(new Person(10005, "Gina Nurjannah", "Kasturi", new Date())));
        logger.info("Update 10003 -> {} ", repository.update(new Person(10003, "Widiya", "Cikijing", new Date())));
        logger.info("User id 10002 -> {}", repository.findById(10003));
        logger.info("All users -> {}",repository.findAll());
        repository.deleteById(10002);


//        logger.info("User name HERA -> {}", dao.findByName("HERA"));
//        logger.info("Location Cingambul -> {}", dao.findByLocation("CINGAMBUL"));


    }
}
