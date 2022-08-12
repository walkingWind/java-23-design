package part5.demo1;

/**
 * @Author zhengcan
 * @Date 2022/8/2 14:01
 * @Version 1.0
 * @Description 原型模式 浅拷贝
 * 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
 * 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组，某个类型的对象等，那么浅拷贝会进行引用传递，也就是只是该成员变量的引用值（内存地址）复制一份给新的对象，因为实际上两个对象的该成员变量都指向同一个实例，在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
 * 克隆羊的案例就是浅拷贝
 * 浅拷贝是使用默认的clone（）方法来实现sheep=（Sheep）super。clone（）；
 *
 * 浅拷贝的引用对象指向同一个，这是最浅拷贝的最主要特征，一个值改变，可能引起另外一个也跟着变
 *
 * 参考
 *  https://segmentfault.com/a/1190000023831083
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep2: " + sheep2+"sheep.friend2="+sheep2.getFriend().hashCode());
        System.out.println("sheep3: " + sheep3+"sheep.friend3="+sheep3.getFriend().hashCode());
        System.out.println("sheep4: " + sheep4+"sheep.friend4="+sheep4.getFriend().hashCode());
        System.out.println(sheep2.getFriend() == sheep3.getFriend());
        System.out.println(sheep4.getFriend() == sheep3.getFriend());
    }
}
