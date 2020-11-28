/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controller;

import co.g2academy.bootcamp.entity.Person;
import co.g2academy.bootcamp.helper.EncryptionHelper;
import co.g2academy.bootcamp.model.RegistrationValidator;
import co.g2academy.bootcamp.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cimiko
 */
@RestController
@RequestMapping("/api")
public class PersonCrudController {

    @Autowired
    private PersonService personService;

    @Autowired
    private RegistrationValidator validator;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAll();
    }

    @GetMapping("/person/id/{id}")
    public Person getPerson(@PathVariable Integer id) {
        return personService.getById(id);
    }

    @GetMapping("/person/user-name/{userName}")
    public Person getPerson(@PathVariable String userName) {
        return personService.getByUserName(userName);
    }

    @PostMapping("/person")
    public Person save(@RequestBody Person p) {
        if (validator.validateEmail(p)) {
            //need to encrypt password
            p.setPassword(bCryptPasswordEncoder.encode(p.getPassword()));
            personService.save(p);
            //need to get the latest data from database
            return personService.getByUserName(p.getName());
        }
        return null;
    }

    @PutMapping("/person/{id}")
    public Person update(@RequestBody Person p) {
        p.setPassword(bCryptPasswordEncoder.encode(p.getPassword()));
        return personService.save(p);
    }

    @DeleteMapping("person/{id}")
    public Person delete(@PathVariable Integer id) {
        Person p = personService.getById(id);
        if (p != null) {
            return personService.delete(p);
        }
        return p;
    }
}
