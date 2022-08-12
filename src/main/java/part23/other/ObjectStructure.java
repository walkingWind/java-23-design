package part23.other;

import part23.computer.Computer;
import part23.user.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhengcan
 * @Date 2022/8/12 10:01
 * @Version 1.0
 * @Description 还需要定义一个结构对象角色，提供一个的接口并允许该访问者进行访问，它可以对这些角色进行增加、修改或删除等操作和遍历。
 */
public class ObjectStructure {
    private List<Computer> computers = new ArrayList<Computer>();

    public void action(Visitor visitor) {
        computers.forEach(c -> {
            c.accept(visitor);
        });
    }
    public void add(Computer computer) {
        computers.add(computer);
    }
}
