package part12.proxy;

import part12.shape.Shape;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zhengcan
 * @Date 2022/8/3 17:34
 * @Version 1.0
 * @Description java 反射编程 动态代理2
 */
public class DynamicProxy2 {
    private Shape shape;
    private Object proxyObj;

    public DynamicProxy2(Object o){
        this.proxyObj = o;
    }

    public void draw(){
        this.shape = invokeShape();
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("-----给边界上色为红色-----");
    }

    /**
     * 动态new对象的两种方式
     * 1.调用无参构造器 ，若是没有，则会报异常
     * Object o = clazz.newInstance();
     *
     * 2.有带参数的构造函数的类，先获取到其构造对象，再通过该构造方法类获取实例：
     * // 获取构造函数类的对象
     * Constroctor constroctor = clazz.getConstructor(String.class,Integer.class);
     * // 使用构造器对象的newInstance方法初始化对象
     * Object obj = constroctor.newInstance("龙哥", 29);
     * 　　
     * @return
     */
    public Shape invokeShape() {
        Shape shape = null;
        try {
            shape = (Shape)this.proxyObj.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
