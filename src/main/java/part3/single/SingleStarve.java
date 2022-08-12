package part3.single;

/**
 * @Author zhengcan
 * @Date 2022/7/29 17:24
 * @Version 1.0
 * @Description 饿汉模式
 */
public class SingleStarve {

    //类被加载时候就创建，也就是程序启动时候。占内存~ 线程安全
    private static final SingleStarve starve = new SingleStarve();
    //私有化构造方法
    private SingleStarve(){}

    //公有获取方法
    public static SingleStarve getInstance(){
        return starve;
    }

}
