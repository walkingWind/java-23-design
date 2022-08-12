package part21.strategy;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:56
 * @Version 1.0
 * @Description 决策者
 */
public class SalesMan {

    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //展示促销活动
    public void salesManShow() {
        strategy.show();
    }
}
