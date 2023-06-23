package com.eyy.learning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author tiantong007
 * @since 2023-06-23 13:29:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 693673176426236787L;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户类型
     */
    private String role;
    /**
     * 余额
     */
    private Double balance;
}


