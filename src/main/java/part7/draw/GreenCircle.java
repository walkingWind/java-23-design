package part7.draw;

/**
 * @Author zhengcan
 * @Date 2022/8/2 15:49
 * @Version 1.0
 * @Description 绿色 圆形
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
