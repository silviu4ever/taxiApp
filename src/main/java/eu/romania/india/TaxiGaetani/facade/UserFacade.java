package eu.romania.india.TaxiGaetani.facade;
import eu.europa.ec.oib.platform.data.api.ICrudFacade;
import eu.europa.ec.oib.platform.data.api.ICrudService;
import eu.europa.ec.oib.platform.data.facade.CrudFacade;
import eu.europa.ec.oib.platform.data.service.CrudService;
import eu.romania.india.TaxiGaetani.entity.User;
import eu.romania.india.TaxiGaetani.service.IUserService;
import eu.romania.india.TaxiGaetani.vo.UserVO;
import org.aspectj.lang.SoftException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFacade extends CrudFacade<User, Integer> implements IUserFacade {
    @Autowired
    private IUserService userService;

    public UserVO saveUser(UserVO userVO){
        User user = new User();
        user.setFirstName(userVO.getFirstName());
        user.setLastName(userVO.getLastName());
        User save = userService.saveUser(user);
        return convertUser(save);
    }

    private UserVO convertUser(User user){
        UserVO _newUser = new UserVO();
        _newUser.setId(user.getId());
        _newUser.setFirstName(user.getFirstName());
        _newUser.setLastName(user.getLastName());
        return _newUser;
    }

    public UserVO login(String username, String password){
        User loggedInUser = userService.getUserByLogin(username, password);
        return convertUser(loggedInUser);
    }
}