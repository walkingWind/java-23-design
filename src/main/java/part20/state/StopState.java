package part20.state;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:38
 * @Version 1.0
 * @Description
 */
public class StopState implements State {

    /**
     * 具体行为
     * @param context
     */
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
