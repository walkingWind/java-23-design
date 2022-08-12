package part6.adapters;

import part6.round.RoundPeg;
import part6.square.SquarePeg;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:40
 * @Version 1.0
 * @Description  适配器类
 * 这个类是这个模式的关键
 * 首先是继承了RoundPeg  因为入孔需要一个RoundPeg对象，继承回来后，就可以传入SquarePegAdapter对象了~~
 * 另外就是打孔方法里面主要用了RoundPeg的getRadius，所以要重写这个方法，让方钉和圆钉通过重新的方法建立转换关系
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
