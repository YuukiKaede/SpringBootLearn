package com.springbootlearn;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author Z4
 * @Date 2022/4/22
 */
public class Teacher extends Person implements Work,Home{
    public Teacher(String address, String workName) {
        setHome(address);
        setWork(workName);
    }

    @Override
    public void setHome(String address) {
        this.home = address;
    }

    @Override
    public void setWork(String workName) {
        this.work = workName;
    }

    @Override
    public void introduction() {
        System.out.println(this.work + this.home);
    }

    static void say(){
        System.out.println("i'm teacher");
    }
}
