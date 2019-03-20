package com.lux.uchat.api;

import com.lux.uchat.common.ApiResult;
import com.lux.uchat.domain.User;
import com.lux.uchat.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



@RestController
public class UserController {
    @Autowired
    private UserService _userService;
    @Value("${custom.upload.filePath}")
    private String _filePath;

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
    @PostMapping("/api/upload")
    public ApiResult<String> upload(@RequestParam("file") MultipartFile file){
        ApiResult result  = new ApiResult();
        String fileName  = file.getOriginalFilename();

        String savePath = _filePath+fileName;
        File destFile = new File(savePath);
        try {
            file.transferTo(destFile);
            result.Make(0,"文件上传成功","");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  result;
    }
}

