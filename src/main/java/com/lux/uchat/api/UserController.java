package com.lux.uchat.api;

import com.lux.uchat.common.ApiResult;
import com.lux.uchat.domain.User;
import com.lux.uchat.service.UserService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value="获取用户列表", notes="11")
    @RequestMapping(value = "/getuserlist",method = RequestMethod.GET)
    public List<User> getuserlist(){
        return  _userService.getuserList();
    }


    @RequestMapping("/findUser")
    public  List<User> findUser(@RequestBody  User user){
        return  _userService.findUser(user);
    }

    @RequestMapping(value = "/registryuser" ,method = RequestMethod.POST)
    public ApiResult<Long> registryUser(@RequestBody User user){

        ApiResult result  = new ApiResult();

        Long userId = _userService.registryUser(user);

        if(userId>0){
             result.Make(0,"注册成功",user.getUserId());

        }else{
            result.Make(-998,"注册失败","");
        }
        return   result;

    }
}

