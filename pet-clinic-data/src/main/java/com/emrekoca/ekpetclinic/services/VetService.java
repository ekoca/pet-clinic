package com.emrekoca.ekpetclinic.services;

import com.emrekoca.ekpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Emre.
 */
public interface VetService {

    Vet findByid(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
