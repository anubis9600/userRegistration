package tech.anubislab.userRegistration.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "commune")
public class Commune {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer communeId;

    private String name;

    @OneToMany(mappedBy = "commune")
    private List<Quartier> quartiers;

    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;


    public Commune() {
    }

    public Commune(Integer communeId, String name, List<Quartier> quartiers, Ville ville) {
        this.communeId = communeId;
        this.name = name;
        this.quartiers = quartiers;
        this.ville = ville;
    }

    public Integer getCommuneId() {
        return this.communeId;
    }

    public void setId(Integer communeId) {
        this.communeId = communeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quartier> getQuartiers() {
        return this.quartiers;
    }

    public void setQuartiers(List<Quartier> quartiers) {
        this.quartiers = quartiers;
    }

    public Ville getVille() {
        return this.ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getCommuneId() + "'" +
            ", name='" + getName() + "'" +
            ", quartiers='" + getQuartiers() + "'" +
            ", ville='" + getVille() + "'" +
            "}";
    }


}