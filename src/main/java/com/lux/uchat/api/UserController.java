package com.lux.uchat.api;

import com.lux.uchat.common.ApiResult;
import com.lux.uchat.domain.User;
import com.lux.uchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService _userService;

    @RequestMapping("/getuserlist")
    public List<User> getuserlist(){
        return  _userService.getuserList();
    }

    @RequestMapping(value = "/registryuser" ,method = RequestMethod.POST)
    public ApiResult<Long> registryUser(@RequestBody User user){

        ApiResult result = new ApiResult();

        User _user = _userService.registryUser(user);
        Long userId = _user.getUserId();
        if(userId>0){
            result.setCode(0);
            result.setMsg("注册成功");
            result.setData(userId);
        }
        return   result;

    }
}

