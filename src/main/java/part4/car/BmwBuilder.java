package part4.car;

/**
 * @Author zhengcan
 * @Date 2022/8/2 10:42
 * @Version 1.0
 * @Description 宝马制造
 */
public class BmwBuilder extends CarBuilder{
//    private Car car;
//    public BmwBuilder(){
//        this.car = new Car();
//    }

    @Override
    public void buildWheel() {
        this.car.setWheel("宝马轮子");
    }

    @Override
    public void buildShell() {
        this.car.setShell("宝马外壳");
    }

    @Override
    public void buildEngine() {
        this.car.setEngine("宝马产发动机");
    }

    @Override
    public void buildSteeringWheel() {
        this.car.setSteeringWheel("宝马方向盘");
    }

//    @Override
//    public Car getCar() {
//        return car;
//    }
}
