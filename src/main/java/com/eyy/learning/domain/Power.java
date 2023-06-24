package com.eyy.learning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Power)实体类
 *
 * @author tiantong007
 * @since 2023-06-24 17:29:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Power implements Serializable {
    private static final long serialVersionUID = -14339586393116715L;
    /**
     * 权限id
     */
    private Integer pId;
    /**
     * 角色类型
     */
    private String role;
    /**
     * 权限等级
     */
    private Integer pLevel;
}


