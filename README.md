# SpringBootLearn Project
这是一个私人的SpringBoot学习项目

*This is an individual learning project*

> 该项目将初始纯净的SpringBoot（含Web组件和Lombok插件）开始，
master分支保存该纯净版本方便后续不同的研究扩展，
而不同研究都会新开一个分支，同时更新具体分支研究内容至master的README.md中。

### 1.SpringAOP Learn（于2022年5月30日 重新整合上传内容）
> 本分支目的是探讨SpringAOP机制
> 
> 主要内容包括：
> 1. SpringAOP的简单应用
> 2. AOP使用自定义注解
> 3. AOP中@Around通知和其它通知的异同
> 4. AOP中JoinPoint的使用
> 5. AspectJProxyFactory的应用
> 6. 子类父类对AOP的影响
> 7. ……

### 2.JavaFunctionParaTest（于2022年5月30日 重新整合上传内容）
> 本分支是以测试功能并学习为目的的分支
> 
> 主要内容包括：
> 1. 函数接收参数为接口的作用
> 2. 函数接收参数为父类的作用
> 3. 接口和抽象类中方法的运行顺序
> 4. 泛型逆变、协变、不变性质的实例
> 5. 多态性质中父类可以接收子类对象的本质：父类声明变量可以指向子类对象
> 6. ……

### 3.SpringIOC Learn
> 本分支主要研究SpringIOC
>
> 主要内容包括：
> 1. 查看接口和其实现类在注入IOC容器阶段时是哪个注入的，@Autowired注入接口，接口的方法如何实现的？
> > 注入了实现类，接口不能实例化，所以无法注入IOC容器，
> 同时，使用@Autowired注入接口，实际上Spring在调用接口时会去IOC容器中找对应实现类进行操作；