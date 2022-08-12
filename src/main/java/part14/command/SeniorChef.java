package part14.command;

/**
 * @Author zhengcan
 * @Date 2022/8/5 10:22
 * @Version 1.0
 * @Description 厨师类
 */
public class SeniorChef {
    //大厨师类 是命令的Receiver

    /**
     * 做饭
     * @param num
     * @param foodName
     */
    public void makefood(int num, String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
