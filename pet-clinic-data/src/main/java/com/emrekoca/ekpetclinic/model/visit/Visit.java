package com.emrekoca.ekpetclinic.model.visit;

import com.emrekoca.ekpetclinic.model.BaseEntity;
import com.emrekoca.ekpetclinic.model.Pet;

import java.time.LocalDate;

/**
 * Created by Emre.
 */
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}