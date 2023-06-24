package com.eyy.learning.service.impl;

import com.eyy.learning.domain.Certificate;
import com.eyy.learning.mapper.CertificateMapper;
import com.eyy.learning.service.CertificateService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Certificate)表服务实现类
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:33
 */
@Service("certificateService")
public class CertificateServiceImpl implements CertificateService {
    @Autowired
    private CertificateMapper certificateMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public R queryById(Integer id) {
        return R.ok().setData(this.certificateMapper.queryById(id));
    }

    /**
     * 全查询
     *
     * @param certificate 筛选条件
     * @return 查询结果
     */
    @Override
    public R queryAll(Certificate certificate) {
        return R.ok().setData(this.certificateMapper.queryAll(certificate));
    }

    /**
     * 新增数据
     *
     * @param certificate 实例对象
     * @return 实例对象
     */
    @Override
    public R insert(Certificate certificate) {
        this.certificateMapper.insert(certificate);
        return R.ok().setData(certificate);
    }

    /**
     * 修改数据
     *
     * @param certificate 实例对象
     * @return 实例对象
     */
    @Override
    public R update(Certificate certificate) {
        this.certificateMapper.update(certificate);
        return R.ok().setData(this.queryById(certificate.getId()));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public R deleteById(Integer id) {
        boolean del = this.certificateMapper.deleteById(id) > 0;
        return R.ok().setData(del);
    }
}

