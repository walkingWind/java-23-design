package part18.game;

/**
 * @Author zhengcan
 * @Date 2022/8/5 16:06
 * @Version 1.0
 * @Description 游戏存档类
 * Memento 包含了要被恢复的对象的状态。
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
