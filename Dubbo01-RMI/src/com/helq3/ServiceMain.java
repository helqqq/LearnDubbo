package com.helq3;

import com.helq3.service.IPersonService;
import com.helq3.service.ISayService;
import com.helq3.service.impl.PersonServiceImpl;
import com.helq3.service.impl.SayServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @ClassName com.helq3.ServiceMain
 * @Description rpc服务治理框架：提供服务方
 * @Author Helena
 * @Date 2020/12/2 9:55
 */
public class ServiceMain {
    public static void main(String[] args) throws RemoteException {
        //实例化要暴露给远程的方法和接口
        ISayService impl = new SayServiceImpl();
        IPersonService personServiceImpl = new PersonServiceImpl();
        //开启本地服务
        ISayService sayService = (ISayService) UnicastRemoteObject.exportObject(impl, 666);
        IPersonService personService = (IPersonService) UnicastRemoteObject.exportObject(personServiceImpl, 888);
        //服务注册中心
        Registry registry = LocateRegistry.createRegistry(999);
        //注册服务
        registry.rebind("sayService",sayService);
        registry.rebind("personService",personService);
    }
}
