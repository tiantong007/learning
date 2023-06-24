package com.eyy.learning.controller;

import com.eyy.learning.domain.Certificate;
import com.eyy.learning.service.CertificateService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Certificate)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:33
 */
@RestController
@RequestMapping("certificate")
public class CertificateController {
    /**
     * 服务对象
     */
    @Autowired
    private CertificateService certificateService;

    /**
     * 全查询
     *
     * @param certificate 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(Certificate certificate) {
        return this.certificateService.queryAll(certificate);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.certificateService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param certificate 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public R add(@RequestBody Certificate certificate) {
        return this.certificateService.insert(certificate);
    }

    /**
     * 编辑数据
     *
     * @param certificate 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public R edit(@RequestBody Certificate certificate) {
        return this.certificateService.update(certificate);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.certificateService.deleteById(id);
    }

}


