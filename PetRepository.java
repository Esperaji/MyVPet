package org.wecancodeit.virtualpet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
    
}
