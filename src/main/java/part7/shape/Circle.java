package part7.shape;

import part7.draw.DrawAPI;

/**
 * @Author zhengcan
 * @Date 2022/8/2 15:57
 * @Version 1.0
 * @Description 原型类 继承形状，拥有底层功能
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
