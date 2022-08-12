package part20.state;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:38
 * @Version 1.0
 * @Description  状态存储在context里
 */
public class Context {
    private State state;

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
