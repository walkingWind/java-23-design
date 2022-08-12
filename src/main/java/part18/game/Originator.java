package part18.game;

/**
 * @Author zhengcan
 * @Date 2022/8/5 16:07
 * @Version 1.0
 * @Description 游戏信息
 * Originator 创建并在 Memento 对象中存储状态。
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
