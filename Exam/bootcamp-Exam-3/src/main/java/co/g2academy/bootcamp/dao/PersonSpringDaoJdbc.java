/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.dao;

import co.g2academy.bootcamp.entity.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author cimiko
 */
@Component
public class PersonSpringDaoJdbc {

    private final String insertQuery = "insert into T_PERSON(name, password) values (?, ?)";
    private final String updateQuery = "update T_PERSON set name = ?, password = ? where id = ?";
    private final String deleteQuery = "delete from T_PERSON where id = ?";
    private final String getByIdQuery = "select id, name, password from T_PERSON where id = ?"; //select * from T_PERSON where id = ?
    private final String getByUserNameQuery = "select id, name, password from T_PERSON where name = ?";//select * from T_PERSON where name = ?
    private final String getAllQuery = "select id, name, password from T_PERSON";//select * from T_PERSON

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final PersonRowMapper personRowMapper = new PersonRowMapper();

    public Person save(Person p) {
        if (p.getId() == null) {
            jdbcTemplate.update(insertQuery, p.getName(), p.getPassword());
        } else {
            jdbcTemplate.update(updateQuery, p.getName(), p.getPassword(), p.getId());
        }
        return p;
    }

    public Person delete(Person p) {
        jdbcTemplate.update(deleteQuery, p.getId());
        return p;
    }

    public Person getById(Integer id) {
        try {
            return jdbcTemplate.queryForObject(getByIdQuery, personRowMapper, id);
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Person getByUserName(String userName) {
        try {
            return jdbcTemplate.queryForObject(getByUserNameQuery, personRowMapper, userName);
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Person> getAll() {

        return jdbcTemplate.query(getAllQuery, personRowMapper);
    }
}
