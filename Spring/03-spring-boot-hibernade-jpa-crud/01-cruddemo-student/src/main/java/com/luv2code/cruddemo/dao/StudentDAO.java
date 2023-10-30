package com.luv2code.cruddemo.dao;
import com.luv2code.cruddemo.entity.*;
import java.util.List;


public interface StudentDAO {

    public void save(Student student);

    public Student findById(int id);

    public List<Student> findByLastName(String lastName);

    public List<Student> findAll();

    public void update(Student student);

    public void deleteByLastName(String lastname);

    public void delete(int id );
}