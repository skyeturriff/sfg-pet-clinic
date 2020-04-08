package guru.springframework.sfgpetclinic.service;

import java.util.Set;

/**
 * Here we are starting to mimic what we see in Spring Data JPA's
 * {@link org.springframework.data.repository.CrudRepository}. We
 * will not implement every method available from this interface,
 * only those that we need to get us started.
 *
 * This will help with the evolution of the project down the road
 * by defining some common functions that all Pet Clinic Service
 * implementations will require. Now all Pet  Clinic Service
 * interfaces will inherit the common methods, while still allowing
 * us to add in additional methods on the individual Service
 * interfaces as needed.
 *
 * @see OwnerService
 * @see PetService
 * @see VetService
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
