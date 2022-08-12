package part13.template;

/**
 * @Author zhengcan
 * @Date 2022/8/4 14:33
 * @Version 1.0
 * @Description 模板类
 * 这个类主要提供了一个控制变量方法，子类可以重新控制变量，达到不一样得效果
 */
public abstract class WorkTemplate {

    //基本方法
    protected abstract void doSomething();
    protected abstract void doAnything();

    //模板方法
    public void templateMethod(){
        this.doSomething();
        if(this.isDoAnything()) {
            this.doAnything();
        }
    }

    /**
     * 模板方法模式里得标志性方法
     * 钩子方法 这个方法是用来给实现类重写得
     * @return
     */
    public boolean isDoAnything(){
        return false;
    }

}
