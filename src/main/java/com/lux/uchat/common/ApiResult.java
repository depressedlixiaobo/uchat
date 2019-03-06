package com.lux.uchat.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ApiResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;
}
