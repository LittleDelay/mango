package com.mango.core.bean.response;

/**
 * description: API返回结果组装工具
 *
 * @author : xs.Liu
 * @date: 2020-11-03
 */
public class ResponseKit {

    public static SuccessResponseData success() {
        return new SuccessResponseData();
    }

    public static <T> SuccessResponseData success(T object) {
        return new SuccessResponseData(object);
    }

    public static <T> SuccessResponseData success(String message, T object) {
        return new SuccessResponseData(message, object);
    }

    public static ErrorResponseData fail(Integer code, String message) {
        return new ErrorResponseData(code, message);
    }

    public static ErrorResponseData fail(Integer code, String message, Object object) {
        return new ErrorResponseData(code, message, object);
    }


}
