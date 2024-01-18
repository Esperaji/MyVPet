package org.wecancodeit.virtualpet.models;

import java.util.Collection;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelters {

    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String shelterName;
    private String address;
    private String contactPerson;

    @OneToMany(mappedBy = "pets", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pet> pets;

    
    @ManyToMany
    private Collection<Volunteer> volunteers;
    
    protected Shelters() {
    }

    public Shelters(String city, String shelterName, String address, String contactPerson) {
        this.city = city;
        this.shelterName = shelterName;
        this.address = address;
        this.contactPerson = contactPerson;
        
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getShelterName() {
        return shelterName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public Collection<Volunteer> getVolunteers() {
        return volunteers;
    }

     public List<Pet> getPets() {
        return pets;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((shelterName == null) ? 0 : shelterName.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((contactPerson == null) ? 0 : contactPerson.hashCode());
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
        Shelters other = (Shelters) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (shelterName == null) {
            if (other.shelterName != null)
                return false;
        } else if (!shelterName.equals(other.shelterName))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (contactPerson == null) {
            if (other.contactPerson != null)
                return false;
        } else if (!contactPerson.equals(other.contactPerson))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Shelters [city=" + city + ", shelterName=" + shelterName + ", address=" + address + ", contactPerson="
                + contactPerson + "]";
    }

   
}
