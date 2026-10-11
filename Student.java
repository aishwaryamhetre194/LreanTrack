package com.airtribe.learntrack.entity;

public class Student extends Person{
    private static int nextId=1;
    private String batch;
    private boolean active;

    public Student(String firstName,String lastName,String email,String batch,boolean active){
         /*  this.id=id;
          this.firstName=firstName;
          this.lastName=lastName;
          this.email=email;*/

          super(nextId++, firstName, lastName, email);
          this.batch=batch;
          this.active=active;
    }

    public int getId() {
        return id;
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
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
