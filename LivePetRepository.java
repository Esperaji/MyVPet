package org.wecancodeit.virtualpet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.models.LivePet;

public interface LivePetRepository extends CrudRepository<LivePet, Long> {
    
}
