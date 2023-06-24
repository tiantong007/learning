package com.eyy.learning.service.impl;

import com.eyy.learning.domain.Course;
import com.eyy.learning.mapper.CourseMapper;
import com.eyy.learning.service.CourseService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:34
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer cId) {
        return R.ok().setData(this.courseMapper.queryById(cId));
    }

    /**
     * 全查询
     *
     * @param course 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Course course) {
        return R.ok().setData(this.courseMapper.queryAll(course));
    }

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Course course) {
        this.courseMapper.insert(course);
        return R.ok().setData(course);
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Course course) {
        this.courseMapper.update(course);
        return R.ok().setData(this.queryById(course.getCId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer cId) {
        boolean del = this.courseMapper.deleteById(cId) > 0;
        return R.ok().setData(del);
    }
}

