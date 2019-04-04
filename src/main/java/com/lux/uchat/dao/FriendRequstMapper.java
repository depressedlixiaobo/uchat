package com.lux.uchat.dao;

import com.lux.uchat.domain.FriendRequst;

public interface FriendRequstMapper {
    int insert(FriendRequst record);

    int insertSelective(FriendRequst record);
}