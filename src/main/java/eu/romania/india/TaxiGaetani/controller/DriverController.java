package eu.romania.india.TaxiGaetani.controller;

import eu.romania.india.TaxiGaetani.facade.DriverFacade;
import eu.romania.india.TaxiGaetani.vo.DriverVO;
import eu.romania.india.TaxiGaetani.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverFacade driverFacade;
    @GetMapping("location/{longitude}/{latitude}")
    public List<DriverVO> findAll(@PathVariable("longitude") Double longitude, @PathVariable("latitude") Double latitude){
        return driverFacade.findBasedOnLocation(latitude, longitude);
    }
    @PostMapping
    public DriverVO save(@RequestBody DriverVO driver){
        return driverFacade.saveDriver(driver);
    }
    @PostMapping("/location/{id}")
    public DriverVO updateLocation(@PathVariable("id") Integer id, @RequestBody LocationVO locationVO){
        return driverFacade.updateDriverLocation(id, locationVO);
    }
}