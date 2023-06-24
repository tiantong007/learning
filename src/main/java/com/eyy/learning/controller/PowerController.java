package com.eyy.learning.controller;

import com.eyy.learning.domain.Power;
import com.eyy.learning.service.PowerService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Power)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:29:02
 */
@RestController
@RequestMapping("power")
public class PowerController {
    /**
     * 服务对象
     */
    @Autowired
    private PowerService powerService;

    /**
     * 全查询
     *
     * @param power 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(Power power) {
        return this.powerService.queryAll(power);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.powerService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param power 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public R add(@RequestBody Power power) {
        return this.powerService.insert(power);
    }

    /**
     * 编辑数据
     *
     * @param power 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    //bug
    public R edit(@RequestBody Power power) {
        return this.powerService.update(power);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.powerService.deleteById(id);
    }

}


