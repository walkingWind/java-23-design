package part16;

import part16.msg.SubscribeUser;
import part16.topic.TopicSubject;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:26
 * @Version 1.0 行为型模式
 * @Description 观察者模式
 * 定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。
 *
 * 一对多
 * 消息队列的实现，通常是这种模式
 */
public class Part16Main {
    public static void main(String[] args) {

        /**
         * 创建主题
         * 并添加主题的订阅者
         */
        TopicSubject ss = new TopicSubject();
        ss.attach(new SubscribeUser("张三"));
        ss.attach(new SubscribeUser("李四"));

        /**
         * 向所有主题的订阅者发送消息
         */
        ss.notify("哈哈哈");

    }
}
