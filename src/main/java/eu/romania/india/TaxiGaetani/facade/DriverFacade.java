package eu.romania.india.TaxiGaetani.facade;
import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.service.IDriverService;
import eu.romania.india.TaxiGaetani.vo.DriverVO;
import eu.romania.india.TaxiGaetani.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class DriverFacade implements IDriverFacade {
    @Autowired
    private IDriverService driverService;

    public List<DriverVO> findBasedOnLocation(Double longitude, Double latitude){
        return driverService.findBasedOnLocation(longitude, latitude)
                .stream().map(this::convertDriver)
                .collect(Collectors.toList());
    }

    public DriverVO saveDriver(DriverVO driverVO){
        Driver driver = new Driver();
        driver.setBrand(driverVO.getBrand());
        driver.setModel(driverVO.getModel());
        driver.setFirstName(driverVO.getFirstName());
        driver.setLastName(driverVO.getLastName());
        Driver save = driverService.save(driver);
        return convertDriver(save);
    }

    public DriverVO updateDriverLocation(Integer id, LocationVO locationVO) {
        Driver driver = driverService.updateDriverLocation(id, locationVO.getLatitude(), locationVO.getLongitude());
        return convertDriver(driver);
    }
    private DriverVO convertDriver(Driver driver){
        DriverVO _newDriver = new DriverVO();
        _newDriver.setId(driver.getId());
        _newDriver.setModel(driver.getModel());
        _newDriver.setFirstName(driver.getFirstName());
        _newDriver.setLastName(driver.getLastName());
        _newDriver.setBrand(driver.getBrand());
        return _newDriver;
    }
}