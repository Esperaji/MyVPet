package org.wecancodeit.virtualpet.models;



import jakarta.persistence.*;


@Entity
public class Pet {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String species;
    private String typeOfPet;
    private int boredom;
    
//     pet
//     (boredom,name,pets_id,species,type_of_pet,batteries_charged,oil,software_updated,dtype,id)      
// values
//     (?,?,?,?,?,?,?,?,'RoboticPet',?)

    @ManyToOne
    private Shelters pets;


    public Pet() {
    }

    public Pet(String name, String species, String typeOfPet, int boredom) {
        this.name = name;
        this.species = species;
        this.typeOfPet = typeOfPet;
        this.boredom = boredom;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public int getBoredom() {
        return boredom;
    }

    public Shelters getPets() {
        return pets;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        result = prime * result + ((typeOfPet == null) ? 0 : typeOfPet.hashCode());
        result = prime * result + boredom;
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
        Pet other = (Pet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (species == null) {
            if (other.species != null)
                return false;
        } else if (!species.equals(other.species))
            return false;
        if (typeOfPet == null) {
            if (other.typeOfPet != null)
                return false;
        } else if (!typeOfPet.equals(other.typeOfPet))
            return false;
        if (boredom != other.boredom)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + ", species=" + species + ", typeOfPet=" + typeOfPet + ", boredom=" + boredom + "]";
    }

    

}
