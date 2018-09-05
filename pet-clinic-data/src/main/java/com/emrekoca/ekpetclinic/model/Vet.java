package com.emrekoca.ekpetclinic.model;

import java.util.Set;

/**
 * Created by Emre.
 */
public class Vet extends Person {
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
