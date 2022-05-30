package com.springbootlearn;

/**
 * @ClassName GoodByeAfter
 * @Description 注解继承测试子类
 * @Author STRC
 * @Date 2022/5/9 8:38
 * @Version 1.0
 **/
public class Son extends Father {
    @Override
    public void say(String ss) {
        System.out.println("said over");
    }

    public void sayAfter(){
        System.out.println("over");
    }
}
