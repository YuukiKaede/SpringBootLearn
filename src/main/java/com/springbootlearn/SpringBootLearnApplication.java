package com.springbootlearn;

import com.springbootlearn.aop.SimpleAspect;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);
        // 使用AnnotationConfigApplicationContext重新注册HelloWorld.class，这样虽然将HelloWorld加入了IOC，但是并没有加载相应的AOP配置，所以AOP不生效
        /*AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(GoodBye.class);
        annotationConfigApplicationContext.refresh()
        GoodBye goodBye= annotationConfigApplicationContext.getBean(GoodBye .class);
        goodBye.say();*/
        /*AspectJ代理实验*/
        /*GoodBye goodBye = new GoodBye();
//        goodBye.say();
        // 使用AspectJ代理工厂生成具有AOP代理的目标代理类；
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        proxyFactory.setTarget(goodBye);
        proxyFactory.addAspect(FirstAOP.class);
        GoodBye g2 = proxyFactory.getProxy();
//        g2.say();
        g2.say("a");*/
        /*execution和@annotation实现范围及“+”的实验*/
        /*AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        GoodByeAfter goodByeAfter = new GoodByeAfter();
        proxyFactory.setTarget(goodByeAfter);
        proxyFactory.addAspect(FirstAOP.class);
        GoodByeAfter g3 = proxyFactory.getProxy();
//        g2.say();
        g3.say("A");
        g3.sayAfter();*/
        /*接口实现类实验*/
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        Imple b = new Imple();
        proxyFactory.setTarget(b);
        //是否使用CGLib代理
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.addAspect(SimpleAspect.class);
        Imple b1 = proxyFactory.getProxy();
        b1.a();
    }

}
