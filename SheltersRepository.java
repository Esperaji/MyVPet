package org.wecancodeit.virtualpet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.models.Shelters;

public interface SheltersRepository extends CrudRepository<Shelters, Long> {
    
}
