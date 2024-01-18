package org.wecancodeit.virtualpet.models;


import jakarta.persistence.*;

@Entity
public class RoboticPet extends Pet {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int oil;
    private int batteriesCharged;
    private int softwareUpdated;

    //     pet
//     (boredom,name,pets_id,species,type_of_pet,batteries_charged,oil,software_updated,dtype,id)      
// values
//     (?,?,?,?,?,?,?,?,'RoboticPet',?)
    
    public RoboticPet() {
    }

    public RoboticPet(String name, int oil, int batteriesCharged, int softwareUpdated) {
        this.name = name;
        this.oil = oil;
        this.batteriesCharged = batteriesCharged;
        this.softwareUpdated = softwareUpdated;
        
    }

    public RoboticPet(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getOil() {
        return oil;
    }

    public int getBatteriesCharged() {
        return batteriesCharged;
    }

    public int getSoftwareUpdated() {
        return softwareUpdated;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + oil;
        result = prime * result + batteriesCharged;
        result = prime * result + softwareUpdated;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoboticPet other = (RoboticPet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (oil != other.oil)
            return false;
        if (batteriesCharged != other.batteriesCharged)
            return false;
        if (softwareUpdated != other.softwareUpdated)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RoboticPet [name=" + name + ", oil=" + oil + ", batteriesCharged=" + batteriesCharged
                + ", softwareUpdated=" + softwareUpdated + "]";
    }

    

}
