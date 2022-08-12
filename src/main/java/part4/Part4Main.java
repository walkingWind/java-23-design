package part4;

import part4.car.BenzBuilder;
import part4.car.BmwBuilder;
import part4.car.Car;
import part4.car.CarBuilder;
import part4.car.CarDirector;

/**
 * @Author zhengcan
 * @Date 2022/8/1 16:36
 * @Version 1.0 创建型模式
 * @Description 建造者模式
 *  这个模式和工厂模式比较相似
 *  这个模式可以让使用者去定义建造顺序和细节
 *  在注重细节和设计的场景下，可以使用这种模式
 *  这种模式定义了抽象类，而非接口
 */
public class Part4Main {

    public static void main(String[] args) {
        /**
         * 造奔驰
         */
        CarBuilder benzBuilder = new BenzBuilder();
        //直接输出为null，因为还没有经过建造过程
        System.out.println(benzBuilder.getCar().toString());
        /**
         * 造宝马 经过建造过程后输出结果
         */
        CarBuilder bmwBuilder = new BmwBuilder();
        CarDirector carDirector = new CarDirector(bmwBuilder);
        Car car = carDirector.build();
        System.out.println(car.toString());


    }
}
