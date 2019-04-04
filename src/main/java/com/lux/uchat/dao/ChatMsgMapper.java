package com.lux.uchat.dao;

import com.lux.uchat.domain.ChatMsg;

public interface ChatMsgMapper {
    int insert(ChatMsg record);

    int insertSelective(ChatMsg record);
}