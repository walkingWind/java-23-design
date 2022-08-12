package part16.topic;

import part16.msg.Observer;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:41
 * @Version 1.0
 * @Description 抽象主题类
 */
public interface Subject {
    //增加订阅者
    public void attach(Observer observer);

    //删除订阅者
    public void remove(Observer observer);

    //通知订阅者更新消息
    public void notify(String messages);
}
