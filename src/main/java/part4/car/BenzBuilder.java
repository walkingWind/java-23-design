package part4.car;

/**
 * @Author zhengcan
 * @Date 2022/8/2 10:32
 * @Version 1.0
 * @Description 奔驰制造
 */
public class BenzBuilder extends CarBuilder{
//    private Car car;
//    public BenzBuilder(){
//        this.car = new Car();
//    }

    @Override
    public void buildWheel() {
        this.car.setWheel("奔驰轮子");
    }

    @Override
    public void buildShell() {
        this.car.setShell("奔驰外壳");
    }

    @Override
    public void buildEngine() {
        this.car.setEngine("奔驰产发动机");
    }

    @Override
    public void buildSteeringWheel() {
        this.car.setSteeringWheel("奔驰方向盘");
    }

//    @Override
//    public Car getCar() {
//        return car;
//    }
}
