package part1;

import part1.car.CarFactory;

import java.util.Objects;

/**
 * @Author  zhengcan
 * @Date  2022/7/29 10:03
 * @Version 1.0     创建型模式
 * @Description  工厂方法模式 Factory Method
 *      工厂是一个类
 *      某类产品是一个抽象接口  这是关键，一定要抽象出来产品接口
 *      抽象的产品有很多实现类
 */
public class Part1Main {
    public static void main(String[] args) {
        System.out.println(Objects.requireNonNull(CarFactory.getCarByType(0)).getName());
        System.out.println(Objects.requireNonNull(CarFactory.getCarByType(2)).getName());
    }
}
