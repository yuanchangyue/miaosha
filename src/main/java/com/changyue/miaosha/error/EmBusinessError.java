package com.changyue.miaosha.error;

public enum EmBusinessError implements CommonError {

    //10000通用错误类型
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误"),

    //20000关于用户状态码
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002,"用户名或者密码错误"),
    USER_NOT_LOGIN(20003,"用户还未登录"),

    //30000交易信息
    STOCK_NOT_ENOUGH(30001,"库存不足")
    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

}
