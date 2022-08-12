package part20.state;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:37
 * @Version 1.0
 * @Description 状态接口
 */
public interface State {
    //定义行为
    void doAction(Context context);
}
