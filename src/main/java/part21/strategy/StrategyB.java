package part21.strategy;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:55
 * @Version 1.0
 * @Description
 */
public class StrategyB implements Strategy {

    @Override
    public void show() {
        System.out.println("B促销 满100减20");
    }
}
