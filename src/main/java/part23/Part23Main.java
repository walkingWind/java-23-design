package part23;

import part23.computer.Games;
import part23.computer.Photos;
import part23.other.ObjectStructure;
import part23.user.Visitor;
import part23.user.ZhangSan;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:48
 * @Version 1.0 行为型模式
 * @Description 访问者模式
 * 一种操作一组对象的操作，它的目的是不改变对象的定义，但允许新增不同的访问者，来定义新的操作。
 *
 * 主要解决：稳定的数据结构和易变的操作耦合问题
 *
 * 使用场景：
 * 对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作；
 * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 */
public class Part23Main {
    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        // 给结构增加一个节点
        os.add(new Games());
        // 给结构增加一个节点
        os.add(new Photos());
        // 创建一个访问者
        Visitor visitor = new ZhangSan();
        os.action(visitor);
    }
}
