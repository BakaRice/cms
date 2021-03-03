package com.ricemarch.cms.common.facade;

import com.ricemarch.cms.common.enums.BizEnum;
import com.ricemarch.cms.common.enums.BizErrorCodeEnum;

import java.io.Serializable;

/**
 * 返回基类 供新接口使用
 *
 * @author tanwentao
 */
public class BizBaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private T data;

    /**
     * 成功返回 无结果
     */
    public BizBaseResponse() {
        this(BizErrorCodeEnum.SUCCESS, BizErrorCodeEnum.SUCCESS.getDesc());
    }

    /**
     * 错误返回
     *
     * @param errorCode 错误枚举类型
     */
    public BizBaseResponse(BizEnum errorCode) {
        this(errorCode, errorCode.getDesc());
    }

    /**
     * 成功返回
     *
     * @param data 携带数据
     */
    public BizBaseResponse(T data) {
        this(BizErrorCodeEnum.SUCCESS, BizErrorCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 错误返回
     *
     * @param errorCode 错误代码
     * @param message   错误信息
     */
    public BizBaseResponse(BizEnum errorCode, String message) {
        this(errorCode, message, null);
    }

    public BizBaseResponse(BizEnum errorCode, String message, T data) {
        this.code = errorCode.getCode();
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
