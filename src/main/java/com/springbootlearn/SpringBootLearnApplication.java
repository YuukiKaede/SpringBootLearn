package com.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);

        Teacher teacher = new Teacher("a", "b");
        test(teacher, teacher, teacher);
        // 输出结果是TeacherAddress，说明子类、接口实现类都可以传入。
    }

    public static void test(Person person, Home home, Work work){
        home.setHome("Address");
        work.setWork("Teacher");
        person.introduction();
    }

}
