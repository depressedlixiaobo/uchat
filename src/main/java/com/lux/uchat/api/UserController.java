package com.lux.uchat.api;

import com.lux.uchat.domain.User;
import com.lux.uchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService _userService;

    @RequestMapping("/")
    public List<User> getuserlist(){
        return  _userService.getuserList();
    }
}

