package part22.log;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:20
 * @Version 1.0
 * @Description
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("等级为2的info日志  " + message);
    }
}
