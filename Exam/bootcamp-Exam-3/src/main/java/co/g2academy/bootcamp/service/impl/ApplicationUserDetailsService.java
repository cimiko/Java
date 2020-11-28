/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.service.impl;

import co.g2academy.bootcamp.entity.Person;
import co.g2academy.bootcamp.service.PersonService;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author cimiko
 */
@Service
public class ApplicationUserDetailsService implements UserDetailsService{
    
    @Autowired
    private PersonService personService;
    
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        Person person = personService.getByUserName(userName);
        if(person == null){
            throw new UsernameNotFoundException(userName);
        }
        return new User(person.getName(), person.getPassword(), Collections.emptyList());
    }
    
}
