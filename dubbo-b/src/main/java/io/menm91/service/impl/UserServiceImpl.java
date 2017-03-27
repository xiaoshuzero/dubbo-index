package io.menm91.service.impl;

import io.menm91.bean.User;
import io.menm91.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    /**
     * 这里通过模拟查询数据库返回用户信息
     */
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
                User user = new User();
                user.setAge(10 + i);
                user.setId(Long.valueOf(i + 1));
                user.setPassword("123456");
                user.setUsername("username_" + i);
                list.add(user);
        }
        return list;
    }


}
