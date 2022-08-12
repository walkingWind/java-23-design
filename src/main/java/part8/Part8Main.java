package part8;

import part8.decorator.ShapeDecorator;
import part8.shape.Circle;
import part8.shape.Rectangle;
import part8.shape.Shape;

/**
 * @Author zhengcan
 * @Date 2022/8/2 16:33
 * @Version 1.0 结构型模式
 * @Description 装饰模式
 * 使用场景
 * 在某个方法的外围在构建出自己的方法~
 */
public class Part8Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new ShapeDecorator(circle);
        ShapeDecorator redRectangle = new ShapeDecorator(new Rectangle());
        circle.draw();

        System.out.println("------------装饰模式开始-----------------");
        redCircle.draw();

        System.out.println("------------装饰模式开始-----------------");
        redRectangle.draw();
    }


}
