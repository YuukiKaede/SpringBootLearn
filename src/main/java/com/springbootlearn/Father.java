package com.springbootlearn;

import com.springbootlearn.aop.DiyAnno;
import org.springframework.stereotype.Component;

/**
 * @ClassName GoodBye
 * @Description 注解继承测试父类
 * @Author Z4
 * @Date 2022/4/19
 */
@Component
public class Father {
    @DiyAnno
    public void say(){
        System.out.println("Good Bye!");
    }

    @DiyAnno
    public void say(String ss){
        System.out.println(ss);
    }
}
