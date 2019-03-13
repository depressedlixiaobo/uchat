package com.lux.uchat.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ApiResult<T> implements Serializable {

    public ApiResult(Integer code,String msg,T data){
        this.setMsg(msg);
        this.setCode(code);
        this.setData(data);
    }

    private Integer code;
    private String msg;
    private T data;
}
