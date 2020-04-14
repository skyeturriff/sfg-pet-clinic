package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.service.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class acts as the base class for all of Pet Clinic's
 * map-based services. It is backed by a {@link Map} instance,
 * which will store all type {@code T} entities and provide
 * the basic CRUD operations on the map that are found in the
 * {@link CrudService} contract.
 *
 * This follows the Open-Closed Principle by encapsulating the
 * common code of our map-based Pet Clinic Service's within a
 * base class.
 *
 * @param <T>  the domain type to manage
 * @param <ID> the domain type's id type
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    /**
     * For map-based implementation, our definition of
     * the save method is a bit different than the base
     * CRUD definition found in {@link CrudService}.
     * We require an id as our entities will be stored
     * in a {@code Map}. Because we do not know what
     * {@code T} is, and whether it will have its own
     * {@code id} field, we explicitly ask for it as a
     * method parameter.
     */
    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }
}
