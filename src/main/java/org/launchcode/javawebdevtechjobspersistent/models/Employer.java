package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {
    public Employer() {}
    @NotBlank(message = "Location required.")
    @Size(message = "Less than 40 characters.", max = 40)
    private String location;
    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<Job>();
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}