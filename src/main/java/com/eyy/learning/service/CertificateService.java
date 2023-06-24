package com.eyy.learning.service;

import com.eyy.learning.domain.Certificate;
import com.eyy.learning.util.R;

/**
 * (Certificate)表服务接口
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:33
 */
public interface CertificateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    R queryById(Integer id);

    /**
     * 全查询
     *
     * @param certificate 筛选条件
     * @return 查询结果
     */
    R queryAll(Certificate certificate);

    /**
     * 新增数据
     *
     * @param certificate 实例对象
     * @return 实例对象
     */
    R insert(Certificate certificate);

    /**
     * 修改数据
     *
     * @param certificate 实例对象
     * @return 实例对象
     */
    R update(Certificate certificate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    R deleteById(Integer id);

}

