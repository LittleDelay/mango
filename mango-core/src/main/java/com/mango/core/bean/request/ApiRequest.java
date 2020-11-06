package com.mango.core.bean.request;

/**
 * description: Api请求基类
 *
 * @author : xs.Liu
 * @date: 2020-11-03
 */
public class ApiRequest {

    /**
     * 当前页
     */
    protected Integer page = 1;

    /**
     * 每页记录数
     */
    protected Integer limit = 10;

    /**
     * 通用ID
     */
    protected Long id;

    /**
     * 查询开始时间
     */
    protected String queryStartTime;

    /**
     * 查询结束时间
     */
    protected String queryEndTime;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public String getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

}
