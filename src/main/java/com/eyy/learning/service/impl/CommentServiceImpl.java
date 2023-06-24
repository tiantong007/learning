package com.eyy.learning.service.impl;

import com.eyy.learning.domain.Comment;
import com.eyy.learning.mapper.CommentMapper;
import com.eyy.learning.service.CommentService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Comment)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:34
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer id) {
        return R.ok().setData(this.commentMapper.queryById(id));
    }

    /**
     * 全查询
     *
     * @param comment 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Comment comment) {
        return R.ok().setData(this.commentMapper.queryAll(comment));
    }

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Comment comment) {
        this.commentMapper.insert(comment);
        return R.ok().setData(comment);
    }

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Comment comment) {
        this.commentMapper.update(comment);
        return R.ok().setData(this.queryById(comment.getId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer id) {
        boolean del = this.commentMapper.deleteById(id) > 0;
        return R.ok().setData(del);
    }
}

