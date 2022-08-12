package part20;

import part20.state.Context;
import part20.state.StartState;
import part20.state.State;
import part20.state.StopState;


/**
 * @Author zhengcan
 * @Date 2022/8/9 17:45
 * @Version 1.0 行为型模式
 * @Description 状态模式
 *
 * 这个模式主要是分离状态和行为，使之解耦
 *
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 *
 * 这个模式和下面的策略模式有点类似
 * 状态模式下，state.doAction(context),调用方是state
 * 策略模式下，调用发类似注入了state对象的context在调用
 */
public class Part20Main {
    public static void main(String[] args) {
        Context context = new Context();

        //状态改变
        State startState = new StartState();
        startState.doAction(context);//具体行为改变

        System.out.println(context.getState().toString());

        //状态改变
        State stopState = new StopState();
        stopState.doAction(context);//具体行为改变

        System.out.println(context.getState().toString());

    }
}
