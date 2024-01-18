package org.wecancodeit.virtualpet.models;

import java.util.Collection;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue
    private Long id;
    
    private String lastName;
    private String firstName;

    @ManyToMany
    private Collection<Shelters> shelters;

    

    public Volunteer(String lastName, String firstName, Shelters shelters) {
        this.lastName = lastName;
        this.firstName = firstName;
        
    }


    public Volunteer(String lastName, String firstName, Collection<Shelters> shelters) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.shelters = shelters;
    }


    public Volunteer() {
    }


    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Collection<Shelters> getShelters() {
        return shelters;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Volunteer other = (Volunteer) obj;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Volunteer [lastName=" + lastName + ", firstName=" + firstName + ", shelters=" + shelters + "]";
    }

   
    
}
