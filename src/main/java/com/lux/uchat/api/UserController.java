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

        ApiResult result ;

        Long userId = _userService.registryUser(user);

        if(userId>0){
            result =   new ApiResult(0,"注册成功",userId);

        }else{
            result =   new ApiResult(-999,"注册失败","");
        }
        return   result;

    }
}

