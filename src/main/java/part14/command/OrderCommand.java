package part14.command;

/**
 * @Author zhengcan
 * @Date 2022/8/5 10:20
 * @Version 1.0
 * @Description 订单命令
 * 连接订单和厨师
 */
public class OrderCommand implements Command{

    //持有接受者对象（厨师）
    private SeniorChef receiver;

    //订单
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    /**
     * 实现拿到菜单的烹饪逻辑
     */
    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单：");
        for (String key : order.getFoodDic().keySet()) {
            receiver.makefood(order.getFoodDic().get(key),key);
        }
        try {
            Thread.sleep(1000); //模拟做饭 睡眠1秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.getDiningTable()+"桌的饭弄好了");
    }
}
