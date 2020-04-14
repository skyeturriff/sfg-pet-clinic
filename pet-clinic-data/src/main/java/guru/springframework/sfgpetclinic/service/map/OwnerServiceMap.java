package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.CrudService;
import guru.springframework.sfgpetclinic.service.OwnerService;

import java.util.Set;

/**
 * In SFG's course, this class extends {@link AbstractMapService}
 * and implements {@link CrudService}. I am going with my intuition
 * that this was a mistake, and that he meant to have it implement
 * {@link OwnerService}. This will allow for us to use this class
 * for dependency injection into the Controller, as planned.
 *
 * This class provides a map-based implementation of the Pet Clinic's
 * {@link OwnerService}.
 *
 * We implement {@link OwnerService} to adhere to the well-defined
 * contract for Pet Clinic's Owner Services. This follows the
 * Dependency Inversion Principle by forcing this class (our low-
 * level map-based implementation) to be dependant on the high-
 * level abstraction ({@link OwnerService} in another package.
 *
 * We extend {@link AbstractMapService} to get access to the base
 * method implementations there. We can route calls to the common
 * methods to the base class, and therefor do not need to re-implement
 * the common methods in each of the map-based implementations.
 *
 * @see PetServiceMap
 * @see VetServiceMap
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    /**
     * Because the {@link OwnerService} contract defines
     * a method not found on the {@link CrudService}
     * contract, no common implementation is available
     * on the base abstract class. So we must provide an
     * implementation here.
     */
    @Override
    public Owner findByLastName(String lastName) {
        //TODO: provide implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    /**
     * Because this implementation is typed, we can
     * safely access the object's {@code id} property
     * and pass it as a parameter when delegating to
     * the base class.
     */
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
