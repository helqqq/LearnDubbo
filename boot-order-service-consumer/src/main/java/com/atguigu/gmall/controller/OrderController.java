package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Helena
 * @Date 2020/12/26 18:28
 */
@RestController //responseBody 返回json格式
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(){
        List<UserAddress> list = orderService.getUser();
        list.stream().forEach(System.out::println);
        return list;
    }

}
