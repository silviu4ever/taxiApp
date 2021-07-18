package eu.romania.india.TaxiGaetani.facade;

import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.vo.DriverVO;
import eu.romania.india.TaxiGaetani.vo.LocationVO;

import java.util.List;

public interface IDriverFacade {
    public List<DriverVO> findBasedOnLocation(Double longitude, Double latitude);

    public DriverVO saveDriver(DriverVO driverVO);

    public DriverVO updateDriverLocation(Integer id, LocationVO locationVO);
}
