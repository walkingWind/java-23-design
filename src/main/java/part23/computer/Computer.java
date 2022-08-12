package part23.computer;

import part23.user.Visitor;

/**
 * @Author zhengcan
 * @Date 2022/8/12 9:57
 * @Version 1.0
 * @Description
 */
public interface Computer {
    void accept(Visitor visitor);
}
