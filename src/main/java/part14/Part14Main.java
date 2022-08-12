package part14;

import part14.command.Order;
import part14.command.OrderCommand;
import part14.command.SeniorChef;
import part14.command.Waitor;

/**
 * @Author zhengcan
 * @Date 2022/8/4 16:46
 * @Version 1.0 行为型模式
 * @Description 命令模式
 * 系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
 * 系统需要在不同的时间指定请求、将请求排队和执行请求。
 * 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
 *
 * 这个例子里，厨师是接收者，调用者是服务员
 *
 * Runable是一个典型命令模式，Runnable担当命令的角色，Thread充当的是调用者，start方法就是其执行方法
 */
public class Part14Main {

    public static void main(String[] args) {
        //创建order
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.getFoodDic().put("西红柿炒鸡蛋", 1);
        order1.getFoodDic().put("罐装可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.getFoodDic().put("酸溜土豆丝", 1);
        order2.getFoodDic().put("王老吉", 1);

        //创建接受者
        SeniorChef receiver = new SeniorChef();
        //将订单和接受者封装成命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);
        //创建调用者 waitor
        Waitor invoke = new Waitor();
        invoke.setCommands(cmd1);
        invoke.setCommands(cmd2);

        //将订单给柜台 呼叫厨师
        invoke.orderUp();

    }

}
