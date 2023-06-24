package com.eyy.learning.service;

import com.eyy.learning.domain.Comment;
import com.eyy.learning.util.R;

/**
 * (Comment)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:33
 */
public interface CommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    R queryById(Integer id);

    /**
     * 全查询
     *
     * @param comment 筛选条件
     * @return 查询结果
     */
    R queryAll(Comment comment);

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    R insert(Comment comment);

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    R update(Comment comment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    R deleteById(Integer id);

}

