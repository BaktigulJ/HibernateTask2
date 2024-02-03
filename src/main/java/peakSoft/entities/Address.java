package peakSoft.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "address_seq", allocationSize = 1)

public class Address extends BaseEntity {
    private String city;
    private String region;
    private String street;

    @OneToOne
    private Agency agency;

    public Address(String city, String region, String street, Agency agency) {
        this.city = city;
        this.region = region;
        this.street = street;
        this.agency = agency;
    }
}
