package com.eyy.learning.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private static final long serialVersionUID = 312584446426358204L;
    /**
     * 课程id
     */
    @JsonProperty(value = "cId")
    private Integer cId;
    /**
     * 课程名
     */
    private String title;
    /**
     * 课程描述
     */
    private String description;
    /**
     * 课程价格
     */
    private Double price;
    /**
     * 课程类型
     */
    private String type;
    /**
     * 开始日期
     */
    private Date startDate;
    /**
     * 结束日期
     */
    private Date endDate;
    /**
     * 任课老师
     */
    private String teacher;
    /**
     * 老师id
     */
    private Integer techerId;
}


