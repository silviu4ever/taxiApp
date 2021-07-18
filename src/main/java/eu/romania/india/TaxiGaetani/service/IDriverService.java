package eu.romania.india.TaxiGaetani.service;

import eu.romania.india.TaxiGaetani.entity.Driver;

import java.util.List;

public interface IDriverService {
    List<Driver> findBasedOnLocation(Double latitude, Double longitude);
    Driver save(Driver driver);
    Driver updateDriverLocation(Integer driverId, double latitude, double longitude);
}
