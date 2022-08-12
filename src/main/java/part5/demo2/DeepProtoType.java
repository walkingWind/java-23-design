package part5.demo2;

import java.io.Serializable;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:12
 * @Version 1.0
 * @Description
 */
public class DeepProtoType implements Serializable, Cloneable{
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    //深拷贝 - 方式1 使用clone 方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独的处理。
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }

}
