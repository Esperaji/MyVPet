package org.wecancodeit.virtualpet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.virtualpet.models.Pet;
import org.wecancodeit.virtualpet.models.RoboticPet;
import org.wecancodeit.virtualpet.models.Shelters;
import org.wecancodeit.virtualpet.models.Volunteer;
import org.wecancodeit.virtualpet.repositories.LivePetRepository;
import org.wecancodeit.virtualpet.repositories.PetRepository;
import org.wecancodeit.virtualpet.repositories.RoboticPetRepository;
import org.wecancodeit.virtualpet.repositories.SheltersRepository;
import org.wecancodeit.virtualpet.repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private PetRepository petRepo;
    @Resource
    private SheltersRepository shelterRepo;
    @Resource
    private RoboticPetRepository roboticPetRepo;
    @Resource
    private LivePetRepository livePetRepo;
    @Resource
    private VolunteerRepository volunteerRepo;

    @Override
    public void run(String... args) throws Exception {

        Pet livePet1 = new Pet("Charlie", "dog", "alive", 50);
        Pet livePet2 = new Pet("Smokey", "cat", "alive", 60);
        Pet livePet3 = new Pet("Tony", "cat", "alive", 40);
        petRepo.save(livePet1);
        petRepo.save(livePet2);
        petRepo.save(livePet3);

        RoboticPet roboPet1 = new RoboticPet("Robodog", 30, 60, 50);
        RoboticPet roboPet2 = new RoboticPet("Catonic", 60, 30, 80);
        RoboticPet roboPet3 = new RoboticPet("Super Sonic", 50, 60, 40);
        roboticPetRepo.save(roboPet1);
        roboticPetRepo.save(roboPet2);
        roboticPetRepo.save(roboPet3);

        Shelters shelter1 = new Shelters("Chicago", "Maco Shelter", "4837 S Martin Luther King Drive", "Val");
        Shelters shelter2 = new Shelters("Evanston", "Our Love Shelter", "5051 S Forrestville Ave", "Esperanza");
        Shelters shelter3 = new Shelters("Monee", "Time Shelter", "12810 N Ridgeland", "Mulan");
        shelterRepo.save(shelter1);
        shelterRepo.save(shelter2);
        shelterRepo.save(shelter3);

        Volunteer person1 = new Volunteer("Raji", "Esperanza", shelter1);
        Volunteer person2 = new Volunteer("Ohaja", "Ifunanya", shelter2);
        Volunteer person3 = new Volunteer("Joseph", "Josipheen", shelter3);
        volunteerRepo.save(person1);
        volunteerRepo.save(person2);
        volunteerRepo.save(person3);
    }
}
