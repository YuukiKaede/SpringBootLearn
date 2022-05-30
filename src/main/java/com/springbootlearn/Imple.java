package com.springbootlearn;

import com.springbootlearn.aop.DiyAnno;

/**
 * @ClassName Son
 * @Description 注解继承测试接口实现类
 * @Author STRC
 * @Date 2022/5/9 8:53
 * @Version 1.0
 **/
public class Imple implements Inter {
    @DiyAnno
    @Override
    public void a() {
        System.out.println("b");
    }
}
