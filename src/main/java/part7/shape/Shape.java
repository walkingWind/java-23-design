package part7.shape;

import part7.draw.DrawAPI;

/**
 * @Author zhengcan
 * @Date 2022/8/2 15:52
 * @Version 1.0
 * @Description 形状类
 *  在桥接模式中，这个Shape是关键，它提供了下面使用的方法，又提供了个自定义的draw抽象接口，其他人可以实现draw，以达到他们的目的
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
