package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * An API for accessing Owner data. We extend our custom concept of
 * {@link CrudService} in order to get all of the methods that are
 * defined there.
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
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
