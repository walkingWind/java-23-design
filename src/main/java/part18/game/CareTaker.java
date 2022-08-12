package part18.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhengcan
 * @Date 2022/8/5 16:08
 * @Version 1.0
 * @Description 存档管理类
 * Caretaker 对象负责从 Memento 中恢复对象的状态。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
