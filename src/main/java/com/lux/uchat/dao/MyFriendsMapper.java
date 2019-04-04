package com.lux.uchat.dao;

import com.lux.uchat.domain.MyFriends;

public interface MyFriendsMapper {
    int insert(MyFriends record);

    int insertSelective(MyFriends record);
}