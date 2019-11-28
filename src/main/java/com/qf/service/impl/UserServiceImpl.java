package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.UserMapper;
import com.qf.service.IUserService;
import com.qf.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author ：lisuqin
 * @date ：Created in 2019/11/27 21:58
 */
@Service
public class  UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
