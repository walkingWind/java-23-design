package part16.msg;

import part16.topic.TopicSubject;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:39
 * @Version 1.0
 * @Description 订阅者
 * 这个对象类似rabbitmq的队列
 */
public class SubscribeUser implements Observer{

    //用户名
    private String name;

    public SubscribeUser(String name) {
        this.name = name;
    }


    @Override
    public void sendMsg(String msg) {
        System.out.println(name + "-- 收到消息 -->" + msg);
    }

}
