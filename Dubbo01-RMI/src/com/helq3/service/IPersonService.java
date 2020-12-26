package com.helq3.service;

import java.rmi.Remote;
import java.util.List;

public interface IPersonService extends Remote {
    public List list() throws Exception;
}
