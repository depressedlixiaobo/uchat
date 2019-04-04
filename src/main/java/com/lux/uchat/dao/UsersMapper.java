package com.lux.uchat.dao;

import com.lux.uchat.domain.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}