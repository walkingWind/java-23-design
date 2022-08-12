package part5.demo2;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:14
 * @Version 1.0
 * @Description 深拷贝 重写clone方法
 * 所谓深拷贝，其实就是让浅拷贝中的引用对象地址也变得不同
 */
public class Demo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name="宋江";
        p.deepCloneableTarget=new DeepCloneableTarget("大牛","小牛的");

        //方式1 完成深拷贝
        DeepProtoType p2=(DeepProtoType)p.clone();
        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name="+p2.name+"p.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());
    }
}
