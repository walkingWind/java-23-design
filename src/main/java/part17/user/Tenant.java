package part17.user;

import part17.house.Mediator;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:43
 * @Version 1.0
 * @Description 房屋承租人
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系的方法
     * @param message
     */
    public void contact(String message){
        this.mediator.contact(message,this);
    }

    /**
     * 获取信息
     * @param message
     */
    public void getMessage(String message){
        System.out.println("承租者" + this.name + "获取到的信息是："+message);
    }

}
