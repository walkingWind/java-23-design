package part14.command;

/**
 * @Author zhengcan
 * @Date 2022/8/5 10:19
 * @Version 1.0
 * @Description
 */
public interface Command {
    /**
     * // 只需要定义一个统一的执行方法
     * 这个例子里，命令是拿到菜单烹饪
     */
    void execute();
}
