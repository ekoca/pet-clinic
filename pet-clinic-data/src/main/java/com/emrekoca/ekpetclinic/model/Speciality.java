package com.emrekoca.ekpetclinic.model;

import java.io.Serializable;

/**
 * Created by Emre.
 */
public class Speciality extends NamedEntity implements Serializable {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
