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
