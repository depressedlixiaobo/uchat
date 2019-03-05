package com.lux.uchat.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class User implements Serializable {
    private  long userId;
    private  String passWord;
    private String email;
    private String nickName;
    private String mobile;
}
