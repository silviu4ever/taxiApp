package eu.romania.india.TaxiGaetani.facade;

import eu.europa.ec.oib.platform.data.api.ICrudFacade;
import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.entity.User;
import eu.romania.india.TaxiGaetani.vo.DriverVO;
import eu.romania.india.TaxiGaetani.vo.LocationVO;
import eu.romania.india.TaxiGaetani.vo.UserVO;

import java.util.List;

public interface IUserFacade extends ICrudFacade<User, Integer> {
    public UserVO saveUser(UserVO userVO);
}
