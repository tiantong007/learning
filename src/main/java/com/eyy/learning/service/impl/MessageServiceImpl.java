package com.eyy.learning.service.impl;

import com.eyy.learning.domain.Message;
import com.eyy.learning.mapper.MessageMapper;
import com.eyy.learning.service.MessageService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Message)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:35
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer id) {
        return R.ok().setData(this.messageMapper.queryById(id));
    }

    /**
     * 全查询
     *
     * @param message 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Message message) {
        return R.ok().setData(this.messageMapper.queryAll(message));
    }

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Message message) {
        this.messageMapper.insert(message);
        return R.ok().setData(message);
    }

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Message message) {
        this.messageMapper.update(message);
        return R.ok().setData(this.queryById(message.getId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer id) {
        boolean del = this.messageMapper.deleteById(id) > 0;
        return R.ok().setData(del);
    }
}

