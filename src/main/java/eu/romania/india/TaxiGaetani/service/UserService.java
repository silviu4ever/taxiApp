package eu.romania.india.TaxiGaetani.service;

import eu.europa.ec.oib.platform.data.service.CrudService;
import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.entity.User;
import eu.romania.india.TaxiGaetani.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService extends CrudService<User, Integer> implements IUserService  {
    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByLogin(String username, String password) {
        return userRepository.getUserByLogin(username, password);
    }
}
