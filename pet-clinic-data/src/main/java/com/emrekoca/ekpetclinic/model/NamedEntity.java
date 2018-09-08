package com.emrekoca.ekpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Emre.
 * <p>
 * Simple JavaBean domain object with an id property. Used as a base class for objects needing this property.
 */
@Setter
@Getter
@MappedSuperclass
public class NamedEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
}
