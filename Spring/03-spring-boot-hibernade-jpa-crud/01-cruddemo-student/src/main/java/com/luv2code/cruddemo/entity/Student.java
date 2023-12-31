package com.luv2code.cruddemo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;


    //define constructions

    public Student(){

    }

    public  Student(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //defining getter and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //define to String method

    public String toString(){
        return "Id = " + this.id + "\nFirst Name = " + this.firstName + "\nLast Name = " + this.lastName + "\nemail = " + this.email;
    }
}
