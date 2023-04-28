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
@Table(name = "ville")
public class Ville {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long villeId;

    private String name;

    @OneToMany(mappedBy = "ville")
    private List<Commune> communes;

    @ManyToOne
    @JoinColumn(name="province_id")
    private Province province;

    public Ville() {
    }

    public Ville(Long villeId, String name, List<Commune> communes, Province province) {
        this.villeId = villeId;
        this.name = name;
        this.communes = communes;
        this.province = province;
    }

    public Long getVilleId() {
        return this.villeId;
    }

    public void setVilleId(Long villeId) {
        this.villeId = villeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Commune> getCommunes() {
        return this.communes;
    }

    public void setCommunes(List<Commune> communes) {
        this.communes = communes;
    }

    public Province getProvince() {
        return this.province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "{" +
            " villeId='" + getVilleId() + "'" +
            ", name='" + getName() + "'" +
            ", communes='" + getCommunes() + "'" +
            ", province='" + getProvince() + "'" +
            "}";
    }

}
