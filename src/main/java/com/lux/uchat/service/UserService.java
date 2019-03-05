package com.lux.uchat.service;

import com.lux.uchat.domain.User;
import com.lux.uchat.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao _dao ;

    public List<User> getuserList(){
        return  _dao.getuserList();
    }
}
