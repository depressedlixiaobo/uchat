package com.lux.uchat.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ApiResult<T> implements Serializable {

    public ApiResult(){
        this.setMsg("系统异常");
        this.setCode(-999);
        this.setData(data);
    }

    public ApiResult(Integer code,String msg,T data){
        this.setMsg(msg);
        this.setCode(code);
        this.setData(data);
    }
    public ApiResult<T> Make(Integer code,String msg,T data){
        this.setMsg(msg);
        this.setCode(code);
        this.setData(data);
        return  this;
    }
    private Integer code;
    private String msg;
    private T data;
}
