package com.springbootlearn;

import com.springbootlearn.aop.DiyAnno;

/**
 * @ClassName Father
 * @Description 注解继承测试接口
 * @Author Z4
 * @Date 2022/4/19
 */
public interface Inter {
    @DiyAnno
    public void a();
}
