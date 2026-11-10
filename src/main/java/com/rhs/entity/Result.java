package com.rhs.entity;

import lombok.Data;

@Data
public class Result {
    private String code;

    private String message;

    private Object data;

    public static Result sucess() {
        Result result = new Result();
        result.setCode("200");
        result.setMessage("操作成功");
        return result;
    }

    public static Result sucess(Object data){
        Result result = new Result();
        result.setCode("200");
        result.setMessage("操作成功");
        result.setData(data);
        return result;
    }

    public static Result error(String message){
        Result result = new Result();
        result.setCode("100");
        result.setMessage(message);
        return result;
    }
}
