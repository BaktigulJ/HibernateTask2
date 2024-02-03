package peakSoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "agencies")
@Getter @Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "agency_gen", allocationSize = 1)

public class Agency extends BaseEntity {
    private String name;
    private String phoneNumber;

    @OneToOne(cascade = {PERSIST,MERGE,DETACH,REFRESH}, mappedBy = "agency")
    private Address address;

    @ManyToMany(cascade = {ALL},mappedBy = "agencyList")
    private List<Owner> ownerList;

    public Agency(String name, String phoneNumber, Address address, List<Owner> ownerList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ownerList = ownerList;
    }
}
