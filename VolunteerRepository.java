package org.wecancodeit.virtualpet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.models.Volunteer;

public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
    
}
