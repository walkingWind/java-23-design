package part3.single;

/**
 * @Author zhengcan
 * @Date 2022/7/29 17:25
 * @Version 1.0
 * @Description 懒汉模式
 *  懒汉模式存在线程安全问题，解决这个问题正确的写法如下
 *  参考 https://blog.csdn.net/fly910905/article/details/79286680
 */
public class SingleLazy {

    //私有静态变量（这里加入volatile保证线程安全）
    private volatile  static SingleLazy singleLazy ;
    //私有构造方法
    private SingleLazy(){}

    //公有获取方法
    public static SingleLazy getInstance(){
        if(singleLazy==null){// 第一次判断，当 instance 为 null 时，则实例化对象，否则直接返回对象
            synchronized (SingleLazy.class){// 同步锁
                if(null == singleLazy){// 第二次判断
                    singleLazy = new SingleLazy();// 实例化对象
                }
            }
        }
        return singleLazy;
    }

}
