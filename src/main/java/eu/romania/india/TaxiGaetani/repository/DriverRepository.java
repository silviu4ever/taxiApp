package eu.romania.india.TaxiGaetani.repository;

import eu.romania.india.TaxiGaetani.entity.Driver;
import org.locationtech.jts.geom.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
    @Query("select e from Driver e where within(e.currentLocation, ?1) = true")
    List<Driver> findByBasedOnLocation(Geometry range);
}
