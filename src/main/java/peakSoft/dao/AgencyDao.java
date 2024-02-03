package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.Agency;

import java.util.List;
import java.util.Optional;

public interface AgencyDao {
    String saveAgency(Agency agency);

    Optional<Agency> findAgencyById(Long id);

    String updateAgencyById(Long agencyId, Agency newAgency);

    void deleteAgencyById(Long id);

    List<Agency> getAllAgencies();

    void dropAgencyTable();

}
