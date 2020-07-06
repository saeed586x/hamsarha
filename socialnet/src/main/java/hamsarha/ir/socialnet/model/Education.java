package hamsarha.ir.socialnet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue
    private Long id;
    private String description;

    public Education(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Education() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
