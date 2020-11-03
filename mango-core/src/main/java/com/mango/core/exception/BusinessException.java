package com.mango.core.exception;

import com.mango.core.constant.BizExceptionEnum;

/**
 * @Author : xs.Liu
 * @Date: 2020-11-03 15:25
 */
public class BusinessException extends RuntimeException {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -3193567924568372098L;
    /**
     * 错误码.
     */
    protected int errCode;
    /**
     * 错误消息.
     */
    protected String errMsg;
    /**
     * 错误详细描述.
     */
    protected String errDetail;

    /**
     * Creates a new instance of BusinessException.
     */
    public BusinessException() {
        super();
    }

    /**
     *
     * @param exception
     */
    public BusinessException(BizExceptionEnum exception) {
        super(exception.getMessage());
        this.errCode = exception.getCode();
        this.errMsg = exception.getMessage();
    }

    /**
     * Creates a new instance of BusinessException.
     * @param err
     */
    public BusinessException(String err) {
        super(err);
    }

    /**
     * 抛出系统异常.
     * @param t
     */
    public BusinessException(Throwable t) {
        super(t);
        this.errCode = BizExceptionEnum.SERVER_ERROR.getCode();
        this.errMsg = t.getMessage();
    }

    /**
     * getErrCode:返回错误码. <br/>
     * @return
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * getErrMsg:返回错误消息. <br/>
     * @return
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * getErrDetail:返回错误详情. <br/>
     * @return
     */
    public String getErrDetail() {
        return errDetail;
    }

}
