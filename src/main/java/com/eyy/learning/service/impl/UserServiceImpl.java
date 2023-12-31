package com.eyy.learning.service.impl;

import com.eyy.learning.domain.User;
import com.eyy.learning.mapper.UserMapper;
import com.eyy.learning.service.UserService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:36
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer id) {
        return R.ok().setData(this.userMapper.queryById(id));
    }

    /**
     * 全查询
     *
     * @param user 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(User user) {
        return R.ok().setData(this.userMapper.queryAll(user));
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(User user) {
        int result = this.userMapper.insert(user);
        return result > 0;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public R update(User user) {
        this.userMapper.update(user);
        return R.ok().setData(this.queryById(user.getId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer id) {
        boolean del = this.userMapper.deleteById(id) > 0;
        return R.ok().setData(del);
    }

    /**
     * 根据邮箱查找用户信息
     * @param email
     * @return 查找到的行数
     */
    @Override
    public int selectUserByEmail(String email) {
        if (email == null){
            return 0;
        }
        return userMapper.selectUserByEmail(email);
    }
}

