package part22.log;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:17
 * @Version 1.0
 * @Description 日志管理类
 */
public abstract class AbstractLogger {

    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 日志打印，假定管理类不能打印比自身等级大的日志
     * 如：error日志只能由ErrorLogger打印，info日志可以由InfoLogger和ErrorLogger打印，debug日志全都可以打印
     * @param level
     * @param message
     */
    public void logMessage(int level, String message) {
        if (this.level >= level) {
            write(message);
            return;
        }
        // 递归效果，不断调用下一级 logMessage
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
