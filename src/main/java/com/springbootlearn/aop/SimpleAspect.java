package com.springbootlearn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName SimpleAspect
 * @Description 简单的AOP切面类
 * @Author STRC
 * @Date 2022/5/30 12:52
 * @Version 1.0
 **/
@Aspect
@Component
public class SimpleAspect {
    // execution表示接入点的表达式，通常用于捕捉多个接入点
    // execution(<修饰符模式>? <返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
    // ..表示当前及其下属类，*表示所有类，.*表示类下的所有方法，括号内..表示所有参数
    @Pointcut("execution(* com.springbootlearn.HelloWorld.*(..)) || @annotation(com.springbootlearn.aop.DiyAnno)")
    public void logAop(){

    }
    //指定目标类中参数为单个String的方法
    @Pointcut("execution(* com.springbootlearn.Father.*(String))")
    public void logAop2(){

    }

    @Pointcut("execution(* com.springbootlearn.Father.*(..))")
    public void logAop3(){

    }

    @Around(value = "logAop()")
    public Object doAround(ProceedingJoinPoint pjp){

        System.out.println(pjp.toString() + "This Around AOP method");
        try {
            System.out.println("This before Around method");
            pjp.proceed();
            System.out.println("This afterreturning Around method");
            return pjp;
        } catch (Throwable e) {
            System.out.println("This afterthrowing around method");
            throw new RuntimeException(e);
        }finally {
            System.out.println("This after Around method");
        }
    }

    // 默认本切面类中的方法
    @Before("logAop3()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("This before AOP method");
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getThis());
    }

    @After("logAop()")
    public void doAfter(){
        System.out.println("This after AOP method");
    }

    // 指定目标切面方法
    @AfterThrowing(value = "com.springbootlearn.aop.SimpleAspect.logAop()")
    public void doAfterThrowing(){
        System.out.println("This afterthrowing AOP method");
    }

    @AfterReturning(value = "com.springbootlearn.aop.SimpleAspect.logAop()")
    public void doAfterReturning(){
        System.out.println("This afterreturning AOP method");
    }
}
