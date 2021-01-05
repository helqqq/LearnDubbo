package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Helena
 * @Date 2020/12/26 15:48
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> list() {
        List<UserAddress> list = new ArrayList<>();
        list.add(new UserAddress(1,"河北","11","冒冒啊","13587652341","Y"));
        list.add(new UserAddress(2,"黑龙江","22","糖球啊","13587652341","Y"));
        return list;
    }
}
