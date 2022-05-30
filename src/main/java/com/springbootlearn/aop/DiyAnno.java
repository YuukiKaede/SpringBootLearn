package com.springbootlearn.aop;

import java.lang.annotation.*;

/**
 * @ClassName DiyAnno
 * @Description Aspect自定义注解
 * @Author STRC
 * @Date 2022/5/30 12:48
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DiyAnno {
}
