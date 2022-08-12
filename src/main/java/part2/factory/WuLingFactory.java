package part2.factory;

import part2.car.Car;
import part2.car.WuLingCar;

/**
 * @Author zhengcan
 * @Date 2022/7/29 16:58
 * @Version 1.0
 * @Description
 */
public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar(){
        return new WuLingCar();
    }
}
