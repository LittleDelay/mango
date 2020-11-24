package com.mango.core.bean.request;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author : xs.Liu
 * @date: 2020-11-24
 */
@Data
public class PageReq {

    @NotNull(message = "pageNum 不能为空")
    private Integer pageNum;

    @NotNull(message = "pageSize 不能为空")
    private Integer pageSize;

}
