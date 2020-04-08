package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * We create interfaces for all the Pet Clinic services.
 *
 * In Spring's reference implementation of the Pet Clinic project, the
 * Repository interfaces are directly injected into the Controllers. In
 * this demonstration, we will create interfaces for all the Pet Clinic
 * services, and inject the Service interfaces into the Controllers
 * instead.
 *
 * This allows us to have multiple Service implementations (for example,
 * a Map implementation, a Spring Data implementation, a web service, a
 * JDBC implementation, etc.) behind the scenes. So the different Service
 * implementations can use different repository technology to access the
 * data, and the Controller is decoupled from this.
 *
 * Spring will inject the correct Service implementations into the
 * Controllers, according to the dependency injection options we
 * configure. So we can easily swap out our data access technologies
 * without introducing breaking changes, and without requiring any
 * modifications to our classes.
 *
 * @see PetService
 * @see VetService
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
