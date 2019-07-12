package com.minelan.vo;

public class ResultMap {
    private int code;
    private String msg;
    private Object obj;

    public ResultMap(int code, String msg, Object obj){
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public static ResultMap success(){
        return new ResultMap(200,"请求成功",null);
    }
}
