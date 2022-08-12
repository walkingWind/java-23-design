package part4.car;

/**
 * @Author zhengcan
 * @Date 2022/8/2 10:26
 * @Version 1.0
 * @Description  定义造车的抽象类
 *  抽象类的好处是，包含部分抽象方法即可
 *  像此类中，把整车返还定义成了固定的公用方法
 *  把部件置造让各子类自己实现
 */
public abstract class CarBuilder {

    protected Car car;

    protected CarBuilder(){
        this.car = new Car();
    }

    //造车轮的方法，因为实际上车轮可能是一个复杂对象
    public abstract void buildWheel();
    //造外壳的方法
    public abstract void buildShell();
    //造引擎的方法
    public abstract void buildEngine();
    //造方向盘的方法
    public abstract void buildSteeringWheel();

    //车子建造的抽象类，这里可以定义造车顺序
    public Car getCar(){
        return this.car;
    }
}
