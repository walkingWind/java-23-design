package part22.log;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:18
 * @Version 1.0
 * @Description
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("等级为1的debug日志  " + message);
    }
}
