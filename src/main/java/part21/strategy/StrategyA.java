package part21.strategy;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:55
 * @Version 1.0
 * @Description
 */
public class StrategyA implements Strategy {

    @Override
    public void show() {
        System.out.println("A促销 买一送一");
    }
}
