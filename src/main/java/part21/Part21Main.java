package part21;

import part21.strategy.SalesMan;
import part21.strategy.StrategyA;
import part21.strategy.StrategyB;

/**
 * @Author zhengcan
 * @Date 2022/8/10 16:50
 * @Version 1.0 行为型模式
 * @Description 策略模式
 * 定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 *
 * 使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 *
 * 注意区分和状态模式的区别，方法调用方就明显不同
 *
 */
public class Part21Main {
    public static void main(String[] args) {
        //采用策略A
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        System.out.println("=======================");

        //采用策略B
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();

    }
}
