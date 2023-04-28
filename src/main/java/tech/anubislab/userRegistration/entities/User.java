package tech.anubislab.userRegistration.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String scondName;

    private String sexe;

    private Integer age;

    private String profession;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "id")
    private String adress;

    private TypeIdentity typeIdenity;

    @Column(unique = true)
    private String idN;

    private boolean isRegistred;    


    public User() {
    }

}
