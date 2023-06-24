package com.eyy.learning.service.impl;

import com.eyy.learning.domain.Power;
import com.eyy.learning.mapper.PowerMapper;
import com.eyy.learning.service.PowerService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Power)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:36
 */
@Service("powerService")
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer pId) {
        return R.ok().setData(this.powerMapper.queryById(pId));
    }

    /**
     * 全查询
     *
     * @param power 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Power power) {
        return R.ok().setData(this.powerMapper.queryAll(power));
    }

    /**
     * 新增数据
     *
     * @param power 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Power power) {
        this.powerMapper.insert(power);
        return R.ok().setData(power);
    }

    /**
     * 修改数据
     *
     * @param power 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Power power) {
        this.powerMapper.update(power);
        return R.ok().setData(this.queryById(power.getPId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer pId) {
        boolean del = this.powerMapper.deleteById(pId) > 0;
        return R.ok().setData(del);
    }
}

