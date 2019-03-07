package com.lux.uchat.dao;

import com.lux.uchat.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getuserList();

    /**
     * 用户注册
     * @return
     */
    User registryUser(User user);

    /**
     * 查找用户
     * @param user
     * @return
     */
    List<User> findUser(User user);
}


