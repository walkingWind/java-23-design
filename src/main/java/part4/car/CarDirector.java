package part4.car;

/**
 * @Author zhengcan
 * @Date 2022/8/2 10:47
 * @Version 1.0
 * @Description 汽车置造 重构 对有顺序要求的
 * 这个类可以对别人封装好的细节进行自己的重构
 */
public class CarDirector {
    private CarBuilder carBuilder;
    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car build(){
        //先造发动机，再造其他的
        carBuilder.buildEngine();
        carBuilder.buildShell();
        carBuilder.buildSteeringWheel();
        carBuilder.buildWheel();
        return carBuilder.getCar();
    }

}
