package com.dupang.dubbo.consumer;

/**
 * Created by dupang on 2016/3/26.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
//        context.start();
//        DemoService demoService = (DemoService)context.getBean("demoServiceimpl"); // 获取远程服务代理
//        String hello = demoService.sayHello("world"); // 执行远程方法
//        System.out.println( hello ); // 显示调用结果

        double ss =  1 >>> 16;
        System.out.println(ss);
    }
}
