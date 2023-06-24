package com.eyy.learning.service;

import com.eyy.learning.domain.Course;
import com.eyy.learning.util.R;

/**
 * (Course)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:34
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    R queryById(Integer cId);

    /**
     * 全查询
     *
     * @param course 筛选条件
     * @return 查询结果
     */
    R queryAll(Course course);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    R insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    R update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    R deleteById(Integer cId);

}

