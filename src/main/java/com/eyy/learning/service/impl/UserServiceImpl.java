package com.eyy.learning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eyy.learning.domain.User;
import com.eyy.learning.service.UserService;
import com.eyy.learning.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 15110
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-22 20:54:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




