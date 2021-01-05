package com.atguigu.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName MainApplication
 * @Description 主程序，启动
 * @Author Helena
 * @Date 2020/12/26 16:40
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext();
        ioc.start();
        System.in.read();
    }
}
