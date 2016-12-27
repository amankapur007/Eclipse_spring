package com.sample.service;


import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.PersonDao;
import com.sample.model.Person;
@Service
public class PersonService {
    @Autowired
    PersonDao dao;
            Hashtable<String,Person> persons=new Hashtable<String,Person>();
    
    public Hashtable<String,Person> getAll(){
     
     System.out.println("ser");
        return dao.getAll();
        
    }
    
    
    public Person getById(String id){
        if(persons.containsKey(id)){
            return persons.get(id);
        }
        else
        {
            return null;
        }
    }
}
