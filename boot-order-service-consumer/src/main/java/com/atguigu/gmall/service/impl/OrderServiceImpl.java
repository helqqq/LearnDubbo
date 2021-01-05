package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description 将服务者注册到注册中心，消费者订阅提供服务者的服务地址
 * @Author Helena
 * @Date 2020/12/26 15:56
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public List<UserAddress> getUser(){
        //查询用户的收货地址
        List<UserAddress> list = userService.list();

        return list;
    }
}
