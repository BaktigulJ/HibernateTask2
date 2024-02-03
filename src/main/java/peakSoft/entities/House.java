package peakSoft.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peakSoft.BaseEntity;
import peakSoft.enums.HouseType;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "house_gen", allocationSize = 1)
public class House extends BaseEntity {
    private HouseType houseType;
    private Integer price;
    private double rating;
    private String description;
    private int room;
    private boolean furniture;

    @OneToOne(cascade = {PERSIST,MERGE, DETACH, REFRESH})
    private Address address;

    @ManyToOne
    private Owner owner;

    public House(HouseType houseType, Integer price,
                 double rating, String description, int room,
                 boolean furniture, Address address, Owner owner) {
        this.houseType = houseType;
        this.price = price;
        this.rating = rating;
        this.description = description;
        this.room = room;
        this.furniture = furniture;
        this.address = address;
        this.owner = owner;
    }
}
