package part19.math;

/**
 * @Author zhengcan
 * @Date 2022/8/5 17:38
 * @Version 1.0
 * @Description
 */
public class NumberInterpreter implements Interpreter{
    //声明了一个number属性
    private int number;
    //构造器（重载）
    public NumberInterpreter(int number) {
        this.number = number;
    }
    //构造器（重载）
    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }
    //重写解释器的interpreter方法
    @Override
    public int interpreter() {
        return this.number;
    }
}
