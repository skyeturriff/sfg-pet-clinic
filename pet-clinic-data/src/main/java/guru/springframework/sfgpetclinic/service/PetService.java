package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @see OwnerService
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
