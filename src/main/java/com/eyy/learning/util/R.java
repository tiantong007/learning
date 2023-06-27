package com.eyy.learning.util;

import lombok.Data;

import java.io.Serializable;
import java.io.StreamTokenizer;

/**
 * 统一返回对象R
 *
 * @author tiantong007
 * @since 2023-06-23 11:45:15
 */
@Data
public class R implements Serializable {
    private static final long serialVersionUID = -39718457250261757L;
    private int code;
    private String message;
    private Object data;

    /**
     * 设置数据
     *
     * @param data 数据
     * @return R
     */
    public R setData(Object data) {
        this.data = data;
        return this;
    }

    public R setMessage(String message){
        this.message = message;
        return this;
    }

    /**
     * 操作成功
     *
     * @return R
     */
    public static R ok() {
        R r = new R();
        r.code = 200;
        r.message = "OK";
        return r;
    }

    /**
     * 认证授权失败。 包括密钥信息不正确；数字签名错误；授权已超时
     *
     * @return R
     */
    public static R fail() {
        R r = new R();
        r.code = 401;
        r.message = "fail";
        return r;
    }

    /**
     * 系统异常
     *
     * @return R
     */
    public static R exp() {
        R r = new R();
        r.code = 500;
        r.message = "exception";
        return r;
    }

    /**
     * 自定义错误消息
     * @param code 状态码
     * @param message 错误消息
     * @return R
     */
    public static R error(Integer code, String message){
        R r = new R();
        r.code = code;
        r.message = message;
        return r;
    }
}


