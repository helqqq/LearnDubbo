package com.helq3.service.impl;

import com.helq3.service.IPersonService;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName PersonServiceImpl
 * @Description TODO
 * @Author Helena
 * @Date 2020/12/2 10:24
 */
public class PersonServiceImpl implements IPersonService {
    @Override
    public List list() throws Exception {
        return Arrays.asList("Coin","Jack","Karl");
    }
}



