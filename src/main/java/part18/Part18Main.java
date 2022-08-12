package part18;

import part18.game.CareTaker;
import part18.game.Originator;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:54
 * @Version 1.0 行为型模式
 * @Description 备忘录模式
 * 保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样可以在以后将对象恢复到原先保存的状态。
 *
 *
 * 使用场景： 1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
 * 例如：打游戏存档
 */
public class Part18Main {
    public static void main(String[] args) {
        Originator originator = new Originator();//游戏信息
        CareTaker careTaker = new CareTaker();//存档管理类
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());//保存档案

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento()); //保存档案

        originator.setState("State #4");
        System.out.println("当前状态 : " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));//获取存档
        System.out.println("恢复到存档1状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("恢复到存档2状态: " + originator.getState());

    }
}
