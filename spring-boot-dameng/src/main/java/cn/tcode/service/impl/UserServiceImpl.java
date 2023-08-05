package cn.tcode.service.impl;

import cn.tcode.entity.User;
import cn.tcode.mapper.UserMapper;
import cn.tcode.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
