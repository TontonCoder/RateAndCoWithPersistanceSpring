package com.tonelv.rateandco.rs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;
    private String Name;
    private String Description;
    private boolean isActive;

    public  Course(){}
    public Course(Integer id, String name, String description, boolean isActive) {
        Id = id;
        Name = name;
        Description = description;
        this.isActive = isActive;
    }

    public Course(String name, String description, boolean isActive) {
        Name = name;
        Description = description;
        this.isActive = isActive;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
