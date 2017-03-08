package com.dupang.dubbo.provider;


import com.dupang.dubbo.service.DemoService;

/**
 * Created by dupang on 2016/3/26.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}