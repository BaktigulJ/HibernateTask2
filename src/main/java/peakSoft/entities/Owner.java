package peakSoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;
import peakSoft.enums.Gender;

import java.util.Date;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "owner_gen", allocationSize = 1)
public class Owner extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private Gender gender;

    @ManyToMany (cascade = {PERSIST, REFRESH, MERGE})
    @JoinTable(name = "owner_agency",
    joinColumns = @JoinColumn(name = "owner_id"),
    inverseJoinColumns = @JoinColumn(name = "agency_id"))
    private List <Agency> agencyList;

    @OneToMany(cascade = {ALL}, mappedBy = "owner")
    private List<House> houseList;

    @ManyToOne
    private RentInfo rentInfo;


    public Owner(String firstName, String lastName, String email,
                 Date dateOfBirth, Gender gender, List<Agency> agencyList,
                 List<House> houseList, RentInfo rentInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.agencyList = agencyList;
        this.houseList = houseList;
        this.rentInfo = rentInfo;
    }
}
