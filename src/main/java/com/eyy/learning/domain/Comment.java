package com.eyy.learning.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {
    private static final long serialVersionUID = -72743825668364463L;
    /**
     * 评论id
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
     * 评论内容
     */
    private String content;
    /**
     * 点赞数
     */
    private Integer likes;
    /**
     * 收藏数
     */
    private Integer collect;
    /**
     * 评论时间
     */
    private Date createTime;
    /**
     * 是否隐藏
     */
    private Integer hide;
}


