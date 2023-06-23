package com.eyy.learning.service;

import com.eyy.learning.domain.User;
import com.eyy.learning.util.R;

/**
 * (User)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-23 11:45:15
 */

public interface UserService {

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
     * @param user 筛选条件
     * @return 查询结果
     */
    R queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    R insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    R update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    R deleteById(Integer id);

}

