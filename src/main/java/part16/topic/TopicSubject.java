package part16.topic;

import part16.msg.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:42
 * @Version 1.0
 * @Description 主题库实现
 * 这个类有点像rabbitmq里的交换机
 */
public class TopicSubject implements Subject{

    /**
     * 订阅者列表
     */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 添加订阅者
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除订阅者
     * @param observer
     */
    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 公众号向所有关注者发通知
     * @param messages
     */
    @Override
    public void notify(String messages) {
        for (Observer observer : observerList) {
            observer.sendMsg(messages);
        }
    }
}
