package part12.proxy;

import part12.shape.Shape;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zhengcan
 * @Date 2022/8/3 16:52
 * @Version 1.0
 * @Description 动态代理 代理对象是Object，相当于所有
 */
public class DynamicProxy implements InvocationHandler {

    private Shape shape;
    private Object proxyObj;

    public DynamicProxy(Object o){
        this.proxyObj = o;
    }

    public void draw(){
        // 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new DynamicProxy(proxyObj);
        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader()
         * ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数 realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口
         * ，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        this.shape = (Shape) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                proxyObj.getClass().getInterfaces(), handler);

        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("-----给边界上色为红色-----");
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("\r\nMethod:" + method);
        // 在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before invoke method " + method.getName());
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(proxyObj, args);
        // 在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after invoke method " + method.getName());

        return null;
    }


}
