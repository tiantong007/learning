package com.eyy.learning.service;

import com.eyy.learning.domain.Power;
import com.eyy.learning.util.R;

/**
 * (Power)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:36
 */
public interface PowerService {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    R queryById(Integer pId);

    /**
     * 全查询
     *
     * @param power 筛选条件
     * @return 查询结果
     */
    R queryAll(Power power);

    /**
     * 新增数据
     *
     * @param power 实例对象
     * @return 实例对象
     */
    R insert(Power power);

    /**
     * 修改数据
     *
     * @param power 实例对象
     * @return 实例对象
     */
    R update(Power power);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    R deleteById(Integer pId);

}

