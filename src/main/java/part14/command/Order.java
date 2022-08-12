package part14.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhengcan
 * @Date 2022/8/5 10:21
 * @Version 1.0
 * @Description 订单类
 */
public class Order {
    // 餐桌号码
    private int diningTable;

    /**
     * 订单内容存储
     * 食物名，数量
     */
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();


    /**
     * 获取桌号
     * @return
     */
    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    /**
     * 订单内容
     * @return
     */
    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    /**
     * 设置订单
     * @param name
     * @param num
     */
    public void setFoodDic(String name, int num) {
        foodDic.put(name, num);

    }
}
