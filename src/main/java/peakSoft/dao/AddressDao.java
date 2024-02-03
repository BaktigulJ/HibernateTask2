package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.Agency;

import java.util.List;
import java.util.Optional;

public interface AddressDao {

    String saveAddress(Address address);

    Optional<Address> findAddressById(Long id);

    String updateAddressById(Long addressId, Address newAddress);

    void deleteAddressById(Long id);

    List<Address> getAllAddresses();

    void dropAddressTable();

    void assignAddressToAgency(Address addressId, Agency agencyId);


}
