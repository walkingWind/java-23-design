package part23.computer;

import part23.user.Visitor;

/**
 * @Author zhengcan
 * @Date 2022/8/12 9:59
 * @Version 1.0
 * @Description
 */
public class Photos implements Computer{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void watch() {
        System.out.println("watch photo");
    }
}
