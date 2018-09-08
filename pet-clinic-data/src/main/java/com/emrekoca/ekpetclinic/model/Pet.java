package com.emrekoca.ekpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Emre.
 */
@Entity
@Table(name = "pets")
public class Pet extends NamedEntity{

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Owner owner;


    @Column(name = "birthdate")
    private LocalDate birthDate;

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
