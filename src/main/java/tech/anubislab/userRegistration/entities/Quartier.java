package tech.anubislab.userRegistration.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "name")
public class Quartier {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long quartierId;

    private String name;

    @ManyToOne
    @JoinColumn(name="commune_id")
    private Commune commune;

    public Quartier() {
    }


    public Quartier(long quartierId, String name, Commune commune) {
        this.quartierId = quartierId;
        this.name = name;
        this.commune = commune;
    }


    public long getQuartierId() {
        return this.quartierId;
    }

    public void setQuartierId(long quartierId) {
        this.quartierId = quartierId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commune getCommune() {
        return this.commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    @Override
    public String toString() {
        return "{" +
            " quartierId='" + getQuartierId() + "'" +
            ", name='" + getName() + "'" +
            ", commune='" + getCommune() + "'" +
            "}";
    }



}
