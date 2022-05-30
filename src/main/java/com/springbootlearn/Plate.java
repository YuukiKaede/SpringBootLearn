package com.springbootlearn;

/**
 * @ClassName Plate
 * @Description 泛型类
 * @Author STRC
 * @Date 2022/5/30 15:32
 * @Version 1.0
 **/
public class Plate<T> {
    private T item;

    public Plate(T item) {
        this.item = item;
        // 查看构造后的泛型类型
        System.out.println("after construct" + this.item.getClass());
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        // 查看设置后的泛型类型
        System.out.println("after set" + this.item.getClass());
    }
}
