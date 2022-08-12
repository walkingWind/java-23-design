package part7.draw;

/**
 * @Author zhengcan
 * @Date 2022/8/2 15:11
 * @Version 1.0
 * @Description 画画api
 */
public interface DrawAPI {
    /**
     * 画圆
     * @param radius 半径
     * @param x 中心点x
     * @param y 中心点y
     */
    void drawCircle(int radius, int x, int y);
}
