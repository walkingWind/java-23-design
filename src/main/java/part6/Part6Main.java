package part6;

import part6.adapters.SquarePegAdapter;
import part6.round.RoundHole;
import part6.round.RoundPeg;
import part6.square.SquarePeg;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:31
 * @Version 1.0 结构型模式
 * @Description 适配器模式
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 *
 * 示例
 * 让方钉打入圆孔
 *
 * 存在你的某个类，要适配别人的方法和规则
 *
 */
public class Part6Main {
    public static void main(String[] args) {
        //圆孔
        RoundHole hole = new RoundHole(11.1);
        //原钉
        RoundPeg roundPeg = new RoundPeg(11);
        //打孔
        System.out.println(hole.fits(roundPeg));
        //方钉1打不进圆孔
        SquarePeg squarePeg1 = new SquarePeg(20);
        SquarePegAdapter apa1 = new SquarePegAdapter(squarePeg1);
        System.out.println(hole.fits(apa1));
        //方钉2成功入圆孔
        SquarePeg squarePeg2 = new SquarePeg(14);
        SquarePegAdapter apa2 = new SquarePegAdapter(squarePeg2);
        System.out.println(hole.fits(apa2));

    }
}
