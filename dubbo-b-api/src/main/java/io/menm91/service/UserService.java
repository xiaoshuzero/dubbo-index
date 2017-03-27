package io.menm91.service;

import io.menm91.bean.User;
import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();
}
