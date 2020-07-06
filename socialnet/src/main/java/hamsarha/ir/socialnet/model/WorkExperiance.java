package hamsarha.ir.socialnet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class WorkExperiance {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Date start;
    private Date end;

    public WorkExperiance(Long id, String description, Date start, Date end) {
        this.id = id;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public WorkExperiance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(int Long) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
