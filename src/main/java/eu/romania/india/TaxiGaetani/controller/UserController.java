package eu.romania.india.TaxiGaetani.controller;

import eu.europa.ec.oib.platform.data.controller.CRUDController;
import eu.romania.india.TaxiGaetani.entity.User;
import eu.romania.india.TaxiGaetani.facade.UserFacade;
import eu.romania.india.TaxiGaetani.service.SearchDriverVO;
import eu.romania.india.TaxiGaetani.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends CRUDController<User, Integer> {
    @Autowired
    private UserFacade userFacade;

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping
    public UserVO saveUser(@RequestBody UserVO user){
        return userFacade.saveUser(user);
    }

    @PostMapping("/login")
    public UserVO login(@PathVariable("username") String username, @PathVariable("password") String password){
        return userFacade.login(username, password);
    }

    @PostMapping("/searchDriver")
    public String seachDriver(SearchDriverVO searchDriverVO){
        jmsTemplate.convertAndSend("searchDriverQueue", searchDriverVO);
        return "okay";
    }
}