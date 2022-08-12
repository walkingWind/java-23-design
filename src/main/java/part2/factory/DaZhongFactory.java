package part2.factory;

import part2.car.Car;
import part2.car.DaZhongCar;

/**
 * @Author zhengcan
 * @Date 2022/7/29 16:58
 * @Version 1.0
 * @Description
 */
public class DaZhongFactory implements CarFactory{
    @Override
    public Car getCar(){
        return new DaZhongCar();
    }
}
