package part13.template;

/**
 * @Author zhengcan
 * @Date 2022/8/4 16:37
 * @Version 1.0
 * @Description 雇员类
 */
public class EmployTemplate extends WorkTemplate{
    @Override
    protected void doSomething() {
        System.out.println("雇员应该做得事情");
    }

    @Override
    protected void doAnything() {
        System.out.println("雇员不可用做任何事情");
    }
}
