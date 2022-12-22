package com.itc.jdbctojpa.jdbc;

import com.itc.jdbctojpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // select * from person
    public List<Person> findAll() {
       return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from person where id=?", new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByName(String name) {
        return jdbcTemplate.queryForObject(
                "select * from person where name=?", new Object[]{name},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByLocation(String location) {
        return jdbcTemplate.queryForObject(
                "select * from person where location=?", new Object[]{location},
                new BeanPropertyRowMapper<Person>(Person.class));
    }
}
