package com.helq3.service.impl;

import com.helq3.service.ISayService;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName com.helq3.service.impl.SayServiceImpl
 * @Description 提供服务方
 * @Author Helena
 * @Date 2020/12/2 9:51
 */
public class SayServiceImpl implements ISayService {
    /**
     * @Description TODO
     * @Author Helena
     * @Date 2020/12/2 9:51  
     * @param text
     **/
    public void sayHello(String text) throws Exception{
        System.out.println("hello " + text);
    }
    /**
     * @Description 获取列表
     * @Author Helena
     * @Date 2020/12/2 10:15
     **/
    public List<String> list() throws Exception{
        return Arrays.asList("11", "helena", "Gary", "Zack");
    }
}
