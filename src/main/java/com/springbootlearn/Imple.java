package com.springbootlearn;

import org.springframework.stereotype.Service;

/**
 * @ClassName Imple
 * @Description TODO
 * @Author STRC
 * @Date 2022/5/30 16:21
 * @Version 1.0
 **/
@Service
public class Imple implements Inter{

    public Imple() {
        System.out.println("construct");
    }
}
