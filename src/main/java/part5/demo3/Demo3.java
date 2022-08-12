package part5.demo3;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:22
 * @Version 1.0
 * @Description 深拷贝 通过对象序列化来实现深拷贝（推荐使用）
 */
public class Demo3 {

    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛的");

        //方式2 完成深拷贝
        DeepProtoType p3=(DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + "p.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}
