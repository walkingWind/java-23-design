package part17.house;

import part17.user.Person;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:39
 * @Version 1.0
 * @Description 抽象中介者
 */
public abstract class Mediator {
    /**
     * 声明一个联络的方法
     * @param message
     * @param person
     */
    public abstract void contact(String message, Person person);
}
