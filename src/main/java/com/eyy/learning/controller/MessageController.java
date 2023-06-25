package com.eyy.learning.controller;

import com.eyy.learning.domain.Message;
import com.eyy.learning.service.MessageService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Message)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:35
 */
@RestController
@RequestMapping("message")
public class MessageController {
    /**
     * 服务对象
     */
    @Autowired
    private MessageService messageService;

    /**
     * 全查询
     *
     * @param message 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(Message message) {
        return this.messageService.queryAll(message);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.messageService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param message 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    //UID RID为空
    public R add(@RequestBody Message message) {
        return this.messageService.insert(message);
    }

    /**
     * 编辑数据
     *
     * @param message 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    //UID RID为空
    public R edit(@RequestBody Message message) {
        System.out.println("aaaaaaaaa"+message);
        return this.messageService.update(message);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.messageService.deleteById(id);
    }

}


