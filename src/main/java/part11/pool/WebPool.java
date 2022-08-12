package part11.pool;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhengcan
 * @Date 2022/8/3 15:54
 * @Version 1.0
 * @Description 这个类其实就是享元模式的核心，资源复用
 */
public class WebPool {

    /**
     * 充当线程池，进行资源复用
     */
    private static final Map<Integer,WebSiteUser> pool = new HashMap<>();

    public WebSite getWebSite(int type) {
        if (!pool.containsKey(type)) {
            // 就创建一个网站，并放入池中
            pool.put(type, new WebSiteUser(type) );
        }
        return pool.get(type);
    }



}
