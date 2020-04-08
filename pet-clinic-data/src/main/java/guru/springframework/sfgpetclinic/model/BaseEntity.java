package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Used as a base class for objects needing an id property.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
