package com.sample.mapper;

import java.util.Hashtable;

import org.apache.ibatis.annotations.Mapper;

import com.sample.model.Person;
@Mapper
public interface PersonMapper {
    
    public Hashtable<String, Person> getAll();
    
}
