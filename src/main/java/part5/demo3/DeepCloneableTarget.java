package part5.demo3;

import java.io.Serializable;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:18
 * @Version 1.0
 * @Description
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String，因此我们这里使用默认的clone完成即可.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
