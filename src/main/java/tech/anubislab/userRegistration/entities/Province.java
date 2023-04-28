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
@Table(name = "province")
public class Province {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long provinceId;

    private String provinceName;

    @OneToMany(mappedBy = "province")
    private List<Ville> villes;

    @ManyToOne
    @JoinColumn(name="adresse_id")
    private Adresse adresse;


    public Province() {
    }

    public Province(long provinceId, String provinceName, List<Ville> villes, Adresse adresse) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.villes = villes;
        this.adresse = adresse;
    }

    public long getProvinceId() {
        return this.provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public List<Ville> getVilles() {
        return this.villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "{" +
            " provinceId='" + getProvinceId() + "'" +
            ", provinceName='" + getProvinceName() + "'" +
            ", villes='" + getVilles() + "'" +
            ", adresse='" + getAdresse() + "'" +
            "}";
    }

}
