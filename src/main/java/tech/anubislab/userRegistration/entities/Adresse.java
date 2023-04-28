package tech.anubislab.userRegistration.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adresse {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TypeAdress typeAdress;

    private Province province;

    private Ville ville;

    private Commune commune;

    private Quartier quartier;

    public Adresse() {
    }

    public Adresse(Long id, TypeAdress typeAdress, Province province, Ville ville, Commune commune, Quartier quartier) {
        this.id = id;
        this.typeAdress = typeAdress;
        this.province = province;
        this.ville = ville;
        this.commune = commune;
        this.quartier = quartier;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeAdress getTypeAdress() {
        return this.typeAdress;
    }

    public void setTypeAdress(TypeAdress typeAdress) {
        this.typeAdress = typeAdress;
    }

    public Province getProvince() {
        return this.province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Ville getVille() {
        return this.ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Commune getCommune() {
        return this.commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    public Quartier getQuartier() {
        return this.quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", typeAdress='" + getTypeAdress() + "'" +
            ", province='" + getProvince() + "'" +
            ", ville='" + getVille() + "'" +
            ", commune='" + getCommune() + "'" +
            ", quartier='" + getQuartier() + "'" +
            "}";
    }
    


}
