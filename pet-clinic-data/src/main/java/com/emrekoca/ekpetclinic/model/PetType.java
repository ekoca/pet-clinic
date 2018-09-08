package com.emrekoca.ekpetclinic.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Emre.
 */
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends NamedEntity {
}
