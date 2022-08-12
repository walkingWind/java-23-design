package part8.decorator;

import part8.shape.Shape;

/**
 * @Author zhengcan
 * @Date 2022/8/2 16:39
 * @Version 1.0
 * @Description 形状装饰器
 * 装饰模式的对象是外表传入的，仅仅加强对象的方法
 *
 * 原则：类应该对扩展开放，对修改关闭。
 */
public class ShapeDecorator  {
    //装饰模式中，一定会持有这个接口对象
    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        //装饰模式中，这个对象是外部传入的。静态代理模式中，这个对象可能就是自己直接new的了
        this.decoratedShape = decoratedShape;
    }


    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("-----给边界上色为红色-----");
    }
}