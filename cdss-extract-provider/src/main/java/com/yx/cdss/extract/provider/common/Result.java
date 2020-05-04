package com.yx.cdss.extract.provider.common;

public class Result<T> {
    // 错误代码，默认0-未出错
    private Integer errCode = 0;
    // 错误消息，默认success-成功
    private String errMsg = "success";
    // 目录对象
    private T value;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setErr(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}