package part12.proxy;

import part12.shape.Circle;
import part12.shape.Shape;

/**
 * @Author zhengcan
 * @Date 2022/8/3 16:34
 * @Version 1.0
 * @Description 静态代理模式  代理对象固定，这里是Circle
 */
public class NormalProxy {

    private Object proxyObj;
    //动态代理模式，真实代理对象
    private Shape shape;

    public NormalProxy(){
        //装饰模式中，这个对象是外部传入的。静态代理模式中，这个对象可能就是自己直接new的了
        this.shape = new Circle();
    }

    public void draw(){
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("-----给边界上色为红色-----");
    }
}
