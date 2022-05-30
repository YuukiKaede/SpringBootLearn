package com.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Description Web请求Controler层类
 * @Author Z4
 * @Date 2022/4/19
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorld {
    private String words;
    @Autowired
    Father goodBye;

    public HelloWorld() {
        this.words = "Hello World!";
    }

    @RequestMapping("/say")
    public void say(){
        System.out.println(this.words);
        goodBye.say();
    }
}
