package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

import javax.management.Query;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    public EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    @Override
    @Transactional
    public void save(Student theStudent){
        entityManager.persist(theStudent);
    }

    public Student findById(int id){
        return entityManager.find(Student.class, id);
    }

    public List<Student> findByLastName(String lastName){

        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theLastName", Student.class);
        theQuery.setParameter("theLastName",lastName);
        return  theQuery.getResultList();
    }
    

    public List<Student> findAll(){
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student){
        entityManager.remove(student);
    }
    
    @Override
    @Transactional
    public void deleteByLastName(String lastname){
        entityManager.createQuery("DELETE FROM Student WHERE lastName = :lastName")
        .setParameter("lastName", lastname)
        .executeUpdate();
    }


    @Override
    @Transactional
    public void delete(int id){
        Student student = findById(id);
        entityManager.remove(student);
    }



}