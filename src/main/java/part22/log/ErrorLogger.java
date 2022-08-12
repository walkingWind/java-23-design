package part22.log;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:20
 * @Version 1.0
 * @Description
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("等级为3的error日志  " + message);
    }
}
