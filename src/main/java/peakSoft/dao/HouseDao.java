package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.House;

import java.util.List;
import java.util.Optional;

public interface HouseDao {
    String saveHouse(House house);

    Optional<House> findHouseById(Long id);

    String updateHouseById(Long houseId, House newHouse);

    void deleteHouseById(Long id);

    List<House> getAllHouses();

    void dropHouseTable();
}
