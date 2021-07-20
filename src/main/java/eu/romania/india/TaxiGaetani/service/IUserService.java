package eu.romania.india.TaxiGaetani.service;

import eu.europa.ec.oib.platform.data.api.ICrudFacade;
import eu.europa.ec.oib.platform.data.api.ICrudService;
import eu.europa.ec.oib.platform.data.facade.CrudFacade;
import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.entity.User;


public interface IUserService extends ICrudService<User, Integer> {
    User saveUser(User user);

    User getUserByLogin(String username, String password);
}
