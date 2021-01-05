package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description 将服务者注册到注册中心，消费者订阅提供服务者的服务地址
 * @Author Helena
 * @Date 2020/12/26 15:56
 */
public class OrderServiceImpl implements OrderService {
    UserService userService;

    public void getUser(){
        //查询用户的收货地址
        List<UserAddress> list = userService.list();
        list.stream().forEach(System.out::println);
    }
}
