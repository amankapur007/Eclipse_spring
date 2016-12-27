package com.sample.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Person;
import com.sample.service.PersonService;

@RestController
@RequestMapping("/people")
public class PersonController {
    PersonController(){
        System.out.println("Hii you are welcome");
    }
    @Autowired
    PersonService ps;
    @RequestMapping("/all")
    public Hashtable<String, Person> getAll() {
        System.out.println("In all21");
        return ps.getAll();
    }
    @RequestMapping("{id}")
    public Person PeopleById(@PathVariable("id") String id) {
        System.out.println("By id");
        return ps.getById(id);
    }
    
    
    

}
