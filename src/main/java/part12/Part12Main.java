package part12;

import part12.proxy.DynamicProxy;
import part12.proxy.DynamicProxy2;
import part12.proxy.NormalProxy;
import part12.shape.Circle;
import part12.shape.Rectangle;
import part12.shape.Shape;

/**
 * @Author zhengcan
 * @Date 2022/8/3 16:10
 * @Version 1.0 结构型模式
 * @Description 代理模式
 * 代理模式本质应该是不想暴露实际对象，所以提供给客户端的是代理对象本身
 */
public class Part12Main {
    public static void main(String[] args) {
//        Shape circle = new Circle();
//        NormalProxy redCircle = new NormalProxy();
//
//        circle.draw();
//
//        System.out.println("------------静态代理模式开始-----------------");
//        redCircle.draw();
//
        System.out.println("------------动态代理模式开始-----------------");
        DynamicProxy dp1 = new DynamicProxy(new Rectangle());
        dp1.draw();
        DynamicProxy dp2 = new DynamicProxy(new Circle());
        dp2.draw();

//        System.out.println("------------动态代理第二种动态创建对象的模式开始-----------------");
//        DynamicProxy2 dp21 = new  DynamicProxy2(Rectangle.class);
//        dp21.draw();
//        DynamicProxy2 dp22 = new  DynamicProxy2(Circle.class);
//        dp22.draw();
    }
}
