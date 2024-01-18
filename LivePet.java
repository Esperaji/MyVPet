package org.wecancodeit.virtualpet.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LivePet extends Pet {

    @Id
    @GeneratedValue
    private Long id;

    private int hungryPet;
    private int thirstyPet;

    public LivePet(String name, String species, String typeOfPet, int boredom, Shelters shelter,
            int hungryPet, int thirstyPet) {
        // super(name, species, "alive", boredom, shelter, hungryPet, thirstyPet);
        this.hungryPet = hungryPet;
        this.thirstyPet = thirstyPet;
    }

    public long getId() {
        return id;
    }

    public int getHungryPet() {
        return hungryPet;
    }

    public int getThirstyPet() {
        return thirstyPet;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + hungryPet;
        result = prime * result + thirstyPet;
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
        LivePet other = (LivePet) obj;
        if (hungryPet != other.hungryPet)
            return false;
        if (thirstyPet != other.thirstyPet)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LivePet [hungryPet=" + hungryPet + ", thirstyPet=" + thirstyPet + "]";
    }

}