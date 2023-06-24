package com.eyy.learning.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Certificate)实体类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certificate implements Serializable {
    private static final long serialVersionUID = -77829965621265847L;
    /**
     * 证书ID
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 发放时间
     */
    private Date createTime;
}


