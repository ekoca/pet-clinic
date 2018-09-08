package com.emrekoca.ekpetclinic.model.visit;

import com.emrekoca.ekpetclinic.model.BaseEntity;
import com.emrekoca.ekpetclinic.model.Pet;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Emre.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
