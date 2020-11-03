package com.mango.core.bean.response;

/**
 * description: 失败操作返回的数据模型定义.
 *
 * @Author : xs.Liu
 * @Date: 2020-11-03 14:39
 */
public class ErrorResponseData extends ApiResponse {

    public ErrorResponseData(Integer code, String message) {
        super(false, code, message, null);
    }

    public ErrorResponseData(Integer code, String message, Object object) {
        super(false, code, message, object);
    }


}
