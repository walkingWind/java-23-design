package part6.round;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:36
 * @Version 1.0
 * @Description 圆孔
 */
public class RoundHole {
    //半径
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * 打孔
     * @param peg 圆钉
     * @return
     */
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
