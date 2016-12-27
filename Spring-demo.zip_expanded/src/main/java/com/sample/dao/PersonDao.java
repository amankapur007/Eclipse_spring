package com.sample.dao;

import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.sample.model.Person;

@Component
public class PersonDao {
    	private final SqlSession sqlSession;

    public PersonDao(SqlSession sqlSession) {

        this.sqlSession=sqlSession;
    }
    
    public Hashtable<String, Person> getAll(){
        System.out.println("DAo21");
        Hashtable<String, Person> k=new Hashtable<>();
        		List<Person> p= this.sqlSession.selectList("com.sample.mapper.PersonMapper.getAll");
        		for(Person p1:p)
        		{
        			k.put(p1.getId().toString(), p1);
        		}
        		return k;
    }
}
