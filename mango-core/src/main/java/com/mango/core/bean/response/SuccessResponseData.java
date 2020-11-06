package com.mango.core.bean.response;

/**
 * description: 成功操作返回的数据模型定义
 *
 * @author : xs.Liu
 * @date: 2020-11-03
 */
public class SuccessResponseData<T> extends ApiResponse {

    public SuccessResponseData() {
        super(true, OK, DEFAULT_SUCCESS_MESSAGE, null);
    }

    public SuccessResponseData(T object) {
        super(true, OK, DEFAULT_SUCCESS_MESSAGE, object);
    }

    public SuccessResponseData(String message, Object object) {
        super(true, OK, message, object);
    }

}
