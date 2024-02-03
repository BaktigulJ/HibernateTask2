package peakSoft.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;
import peakSoft.enums.FamilyStatus;
import peakSoft.enums.Gender;

import java.util.Date;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.CascadeType.REFRESH;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "customer_gen", allocationSize = 1)

public class Customer extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private Gender gender;
    private String nationality;
    private FamilyStatus familyStatus;

    @ManyToOne(cascade = {PERSIST,MERGE, DETACH, REFRESH})
    private RentInfo rentInfo;

    public Customer(String firstName, String lastName, String email,
                    Date dateOfBirth, Gender gender, String nationality,
                    FamilyStatus familyStatus, RentInfo rentInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.familyStatus = familyStatus;
        this.rentInfo = rentInfo;
    }
}
