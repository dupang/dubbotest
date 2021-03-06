/*
 * Copyright © 2017 damai.cn  All rights reserved. 
 * 北京红马传媒文化发展有限公司 版权所有 大麦网      
 *
 * 声明: 对未经许可擅自反编译、修改和使用本源码者，本公司保留追究其法律责任的权利.
 */
package com.dupang.dubbo;

import com.dupang.dubbo.provider.DemoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * <p>ClassName:com.dupang.dubbo.comsumerTest</p>
 * <p>描述:</p>
 * <p>日期:2017年03月08</p>
 *
 * @author duguanxin
 * @version 1.0
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class comsumerTest  {

    @Resource
    DemoServiceImpl demoServiceimpl;

    @Test
    public void testConsumer(){
        System.out.println(demoServiceimpl.sayHello("dupang"));
    }
}
