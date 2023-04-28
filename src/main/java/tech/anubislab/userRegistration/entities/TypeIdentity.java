package tech.anubislab.userRegistration.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class TypeIdentity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designation;


    public TypeIdentity() {
    }

    public TypeIdentity(Long id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public TypeIdentity id(Long id) {
        setId(id);
        return this;
    }

    public TypeIdentity designation(String designation) {
        setDesignation(designation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TypeIdentity)) {
            return false;
        }
        TypeIdentity typeIdentity = (TypeIdentity) o;
        return Objects.equals(id, typeIdentity.id) && Objects.equals(designation, typeIdentity.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            "}";
    }
    


}
