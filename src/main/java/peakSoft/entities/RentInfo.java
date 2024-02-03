package peakSoft.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "rent_info")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "rentInfo_gen", allocationSize = 1)
public class RentInfo extends BaseEntity {
    private boolean checkIn;
    private boolean checkOut;

@OneToMany(cascade = {PERSIST,MERGE, DETACH, REFRESH})
    private List<Agency> agencyListInRent;

@OneToOne(cascade = {PERSIST,MERGE, DETACH, REFRESH})
    private House house;

@OneToMany(cascade = {PERSIST,MERGE, DETACH, REFRESH}, mappedBy = "rentInfo")
    private List<Owner> ownerListInRent;

@OneToMany(cascade = {PERSIST,MERGE, DETACH, REFRESH}, mappedBy = "rentInfo")
    private List<Customer> customerList;


    public RentInfo(boolean checkIn, boolean checkOut, List<Agency>
            agencyListInRent, House house, List<Owner> ownerListInRent,
                    List<Customer> customerList) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.agencyListInRent = agencyListInRent;
        this.house = house;
        this.ownerListInRent = ownerListInRent;
        this.customerList = customerList;
    }
}
