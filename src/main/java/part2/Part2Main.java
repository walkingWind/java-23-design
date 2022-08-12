package part2;

import part2.factory.CarFactory;
import part2.factory.DaZhongFactory;
import part2.factory.WuLingFactory;

/**
 * @Author zhengcan
 * @Date 2022/7/29 10:03
 * @Version 1.0 创建型模式
 * @Description 抽象工厂模式 Abstract Factory
 *      工厂是一个抽象类，围绕着这个抽象类，有很多子工厂
 *      某类产品是一个抽象接口
 *      抽象的产品有很多实现类
 *
 *      这个模式下，可以让调用者更不用关心使用上的细节~~更为方便统一
 *
 */
public class Part2Main {
    public static void main(String[] args) {
        CarFactory factory = new DaZhongFactory();
        System.out.println(factory.getCar().getName());
        CarFactory factory2 = new WuLingFactory();
        System.out.println(factory2.getCar().getName());


    }
}
