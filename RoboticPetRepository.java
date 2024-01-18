package org.wecancodeit.virtualpet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.models.RoboticPet;

public interface RoboticPetRepository extends CrudRepository<RoboticPet, Long> {
    
}
