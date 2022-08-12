package part11;

import part11.pool.User;
import part11.pool.WebPool;
import part11.pool.WebSite;

/**
 * @Author zhengcan
 * @Date 2022/8/3 15:35
 * @Version 1.0 结构型模式
 * @Description 享元模式
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，
 * 如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 *
 * 这个模式比较典型的例子是线程池~
 */
public class Part11Main {
    public static void main(String[] args) {
        User u1 = new User("张三");
        User u2 = new User("李四");
        WebPool webPool = new WebPool();
        /**
         * 初始化2个不同的网站，让两个用户分别去查看网站，发现同类型的网站被复用，hashcode一样
         */
        WebSite w1 = webPool.getWebSite(1);
        WebSite w2 = webPool.getWebSite(2);
        w1.use(u1);
        webPool.getWebSite(1).use(u2);
        w2.use(u1);
        webPool.getWebSite(2).use(u2);
    }
}
