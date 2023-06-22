package com.eyy.learning.service;

import com.eyy.learning.domain.User;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-22 21:29:03
 */
public interface UserService {

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<User> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

