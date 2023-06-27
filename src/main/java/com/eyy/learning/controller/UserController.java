package com.eyy.learning.controller;

import com.eyy.learning.domain.User;
import com.eyy.learning.service.UserService;
import com.eyy.learning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * (User)表控制层
 *
 * @author tiantong007
 * @since 2023-06-24 17:09:36
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 全查询
     *
     * @param user 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryall")
    public R queryAll(User user) {
        return this.userService.queryAll(user);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("query/{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return this.userService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public R add(@RequestBody User user) {
        if (user.getUsername() == null || user.getPassword() == null || user.getEmail() == null){
            return R.error(400, "用户名、密码、邮箱不能为空");
        }
        if ( userService.selectUserByEmail(user.getEmail()) == 1){
            return R.error(401, "该邮箱已被注册");
        }
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if ( !userService.insert(user)){
            return R.ok().setMessage("用户插入失败");
        }
        return R.ok().setMessage("用户插入成功");
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public R edit(@RequestBody User user) {
        return this.userService.update(user);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("delete/{id}")
    public R deleteById(@PathVariable("id") Integer id) {
        return this.userService.deleteById(id);
    }

}


