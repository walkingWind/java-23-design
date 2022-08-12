package part17.user;

import part17.house.Mediator;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:45
 * @Version 1.0
 * @Description 抽象Person类
 * 这个类构建了用户和中介的关系
 */
public  abstract class Person {
    protected String name;
    protected Mediator mediator;

    protected Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
