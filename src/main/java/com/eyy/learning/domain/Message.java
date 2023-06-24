package com.eyy.learning.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Message)实体类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    private static final long serialVersionUID = 259406842755278150L;
    /**
     * 信息id
     */
    private Integer id;
    /**
     * 发送用户id
     */
    private Integer uId;
    /**
     * 接收用户id
     */
    private Integer rId;
    /**
     * 发送内容
     */
    private String content;
    /**
     * 发送时间
     */
    private Date createTime;
}


