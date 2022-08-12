package part13.template;

/**
 * @Author zhengcan
 * @Date 2022/8/4 16:29
 * @Version 1.0 老板
 * @Description 老板类实现了工作模板
 */
public class BossTemplate extends WorkTemplate{
    @Override
    protected void doSomething() {
        System.out.println("老板应该做得事情");

    }

    @Override
    protected void doAnything() {
        System.out.println("老板可以做任何事情");
    }


    //这个标识和父类不一样，但是用了父类一样得templateMethod方法
    @Override
    public boolean isDoAnything() {
        return true;
    }
}
