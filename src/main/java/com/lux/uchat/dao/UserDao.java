package com.lux.uchat.dao;

import com.lux.uchat.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> getuserList();
}
