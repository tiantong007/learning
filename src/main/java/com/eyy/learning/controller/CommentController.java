package com.eyy.learning.controller;

import com.eyy.learning.domain.Comment;
import com.eyy.learning.service.CommentService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Comment)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:34
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Autowired
    private CommentService commentService;

    /**
     * 全查询
     *
     * @param comment 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(Comment comment) {
        return this.commentService.queryAll(comment);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.commentService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param comment 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public R add(@RequestBody Comment comment) {
        return this.commentService.insert(comment);
    }

    /**
     * 编辑数据
     *
     * @param comment 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public R edit(@RequestBody Comment comment) {
        return this.commentService.update(comment);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.commentService.deleteById(id);
    }

}


