package com.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLearnApplication {

    @Autowired
    Inter inter;

    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootLearnApplication.class, args);
        // 查看容器内组件
        String[] strings = run.getBeanDefinitionNames();
        for (String s: strings) {
            System.out.println(s);
        }
        System.out.println();
    }
}
