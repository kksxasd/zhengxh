package com.test.dao;

/**
 * Created by Administrator on 2017/6/2.
 */
public class ResponseInfoBody {
    public ResponseInfoBody(String msg){
        this.msg=msg;
        this.errorId=0;
    }
    //返回信息
    private String msg;
    //返回错误码
    private Integer errorId;

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
