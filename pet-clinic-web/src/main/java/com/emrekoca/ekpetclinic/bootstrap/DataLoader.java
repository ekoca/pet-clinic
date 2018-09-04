package com.emrekoca.ekpetclinic.bootstrap;

import com.emrekoca.ekpetclinic.model.Owner;
import com.emrekoca.ekpetclinic.model.Pet;
import com.emrekoca.ekpetclinic.model.PetType;
import com.emrekoca.ekpetclinic.model.Vet;
import com.emrekoca.ekpetclinic.services.OwnerService;
import com.emrekoca.ekpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Emre.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(final OwnerService ownerService, final VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        //PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        //PetType savedCatPetType = petTypeService.save(cat);

        //Speciality radiology = new Speciality();
        //radiology.setDescription("Radiology");
        //Speciality savedRadiology = specialtyService.save(radiology);

        //Speciality surgery = new Speciality();
        //surgery.setDescription("Surgery");
        //Speciality savedSurgery = specialtyService.save(surgery);

        //Speciality dentistry = new Speciality();
        //dentistry.setDescription("dentistry");
        //Speciality savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        //owner1.setAddress("123 Brickerel");
        //owner1.setCity("Miami");
        //owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setId(1l);
        //mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        //owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        //owner2.setAddress("123 Brickerel");
        //owner2.setCity("Miami");
        //owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setId(1l);
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        //fionasCat.setPetType(savedCatPetType);
        //owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        //Visit catVisit = new Visit();
        //catVisit.setPet(fionasCat);
        //catVisit.setDate(LocalDate.now());
        //catVisit.setDescription("Sneezy Kitty");

        //visitService.save(catVisit);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        //vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        //vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
