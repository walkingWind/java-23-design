package part1.car;

/**
 * @Author zhengcan
 * @Date 2022/7/29 10:09
 * @Version 1.0
 * @Description
 */
public class CarFactory {
    public static Car getCarByType(int type){
        if(type==1){
            return new WuLingCar();
        }else if(type==2){
            return new DaZhongCar();
        }else {
            return null;
        }
    }
}
