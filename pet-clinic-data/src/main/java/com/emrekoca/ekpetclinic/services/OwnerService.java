package com.emrekoca.ekpetclinic.services;

import com.emrekoca.ekpetclinic.model.Owner;

/**
 * Created by Emre.
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
