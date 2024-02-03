package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.RentInfo;

import java.util.List;
import java.util.Optional;

public interface RentInfoDao {

    String saveRentInfo(RentInfo rentInfo);

    Optional<RentInfo> findRentInfoById(Long id);

    String updateRentInfoById(Long rentInfoId, RentInfo newRentInfo);

    void deleteRentInfoById(Long id);

    List<RentInfo> getAllRentInfos();

    void dropRentInfoTable();

}
