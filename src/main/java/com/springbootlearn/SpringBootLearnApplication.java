package com.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);

        /*Teacher teacher = new Teacher("a", "b");
        test(teacher, teacher, teacher);*/
        // 输出结果是TeacherAddress，说明子类、接口实现类都可以传入。

        // 受限于super关键字，泛型只能用Fruit或其父类，体现泛型的逆变，使用Food作为泛型，指定T，之后构造时使用Pear，然后set方法使用Apple，可以使用子类参数，体现多态
//        takeFruit(new Plate<Food>(new Pear()));
        // 不可以使用Food进行构造，因为指定了T是Fruit，根据多态，不可以使用超类替代
//        takeFruit(new Plate<Fruit>(new Food()));
        // 多态的表现之一：可以使用父类（接口）指向子类，父类声明变量（引用变量）存放在方法栈中，其值（即指向的子类对象）则存放在堆中
//        Person person = new Teacher("a", "b");
        // 但不能用子类声明变量指向父类对象，这与泛型的逆变相似
//        RedApple redApple = (RedApple) new Apple();
//        System.out.println(person.getClass());
//        System.out.println(redApple.getClass());
    }

    public static void test(Person person, Home home, Work work){
        home.setHome("Address");
        work.setWork("Teacher");
        person.introduction();
    }

    public static void takeFruit(Plate<? super Fruit> plate){
        plate.setItem(new Apple());
    }

}
