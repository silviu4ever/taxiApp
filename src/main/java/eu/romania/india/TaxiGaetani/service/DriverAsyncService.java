package eu.romania.india.TaxiGaetani.service;

import eu.romania.india.TaxiGaetani.repository.DriverRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DriverAsyncService {
    @Autowired
    private DriverRepository driverRepository;

    @JmsListener(destination = "searchDrivedQueue", containerFactory = "jsonFactory")
    public void searchDriver(SearchDriverVO searchDriverVO){
        log.info("search driver received ={}", searchDriverVO);
    }
}
