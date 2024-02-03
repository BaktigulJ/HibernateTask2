package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerDao {
    String saveOwner(Owner owner);

    Optional<Owner> findOwnerById(Long id);

    String updateOwnerById(Long ownerId, Owner newOwner);

    void deleteOwnerById(Long id);

    List<Owner> getAllOwners();

    void dropOwnerTable();
}
