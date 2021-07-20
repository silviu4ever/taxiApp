package eu.romania.india.TaxiGaetani.repository;

import eu.europa.ec.oib.platform.data.api.PagingAndFilteringRepository;
import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.entity.User;
import org.locationtech.jts.geom.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

/* public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select e from User e where e.userName = ?1 and e.password = ?2")
    User getUserByLogin(String username, String password);
} */
public interface UserRepository extends PagingAndFilteringRepository<User, Integer> {
    @Query("select e from User e where e.userName = ?1 and e.password = ?2")
    User getUserByLogin(String username, String password);
}
