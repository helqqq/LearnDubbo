package com.helq3.service;

import java.rmi.Remote;
import java.util.List;

//Service 继承Remote
public interface ISayService extends Remote {

    public List<String> list() throws Exception;

    public void sayHello(String text) throws Exception;
}
