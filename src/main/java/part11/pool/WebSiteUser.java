package part11.pool;

/**
 * @Author zhengcan
 * @Date 2022/8/3 15:49
 * @Version 1.0
 * @Description 网站类
 */
public class WebSiteUser implements WebSite{

    /**
     * 网站类型
     */
    private int type;

    WebSiteUser(int type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"正在浏览"+changeTypeToName(type)+"网站");
        System.out.println("打印当前对象的hashcode，分辨是否为同一个对象。"+this.hashCode());
    }

    private String changeTypeToName(int type){
        if(type == 1){
            return "新闻";
        }else if(type == 1){
            return "娱乐";
        }else {
            return "生活";
        }
    }

}
