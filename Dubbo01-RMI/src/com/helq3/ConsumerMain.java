package com.helq3;

import com.helq3.service.IPersonService;
import com.helq3.service.ISayService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @ClassName com.helq3.ConsumerMain
 * @Description rpc服务治理框架:服务消费方
 * @Author Helena
 * @Date 2020/12/2 9:58
 */
public class ConsumerMain {
    public static void main(String[] args) throws Exception {
        //获取注册中心
        Registry registry = LocateRegistry.getRegistry(999);
        //获取服务
        ISayService sayService = (ISayService) registry.lookup("sayService");
        //调用服务方法
        sayService.sayHello("provider");
        //获取结果集
        sayService.list().stream().forEach(System.out::println);

        System.out.print("personService:");
        IPersonService personService = (IPersonService) registry.lookup("personService");
        personService.list().stream().forEach(System.out::println);
    }
}
