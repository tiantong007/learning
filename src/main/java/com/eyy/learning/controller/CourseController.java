package com.eyy.learning.controller;

import com.eyy.learning.domain.Course;
import com.eyy.learning.service.CourseService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Course)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:35
 */
@RestController
@RequestMapping("course")
public class CourseController {
    /**
     * 服务对象
     */
    @Autowired
    private CourseService courseService;

    /**
     * 全查询
     *
     * @param course 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(Course course) {
        return this.courseService.queryAll(course);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.courseService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param course 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public R add(@RequestBody Course course) {
        return this.courseService.insert(course);
    }

    /**
     * 编辑数据
     *
     * @param course 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public R edit(@RequestBody Course course) {
        //日期格式为  "2023-06-25T01:09:23"
        System.out.println("更新数据-----------"+course);
        return this.courseService.update(course);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.courseService.deleteById(id);
    }

}


