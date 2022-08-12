package part6.square;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:38
 * @Version 1.0
 * @Description 方钉子
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    /**
     * 方形面积
     * @return
     */
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
