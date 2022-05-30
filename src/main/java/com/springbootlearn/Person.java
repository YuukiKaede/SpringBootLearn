package com.springbootlearn;

/**
 * @ClassName Person
 * @Description 抽象父类
 * @Author Z4
 * @Date 2022/4/21
 */
public abstract class Person {
    // protected可以被子类集继承
    protected String work;
    protected String home;
    // private不能被子类继承
    private String sexual;

    public abstract void introduction();

    static void say(){
        System.out.println("i'm human");
    }
}
