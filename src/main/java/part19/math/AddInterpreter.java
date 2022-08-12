package part19.math;

/**
 * @Author zhengcan
 * @Date 2022/8/5 17:35
 * @Version 1.0
 * @Description
 */
public class AddInterpreter implements Interpreter{

    //第一个表达式
    private Interpreter firstExpression;
    //第二个表达式
    private Interpreter secondExpression;

    //构造器注入
    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    //重写解释器的interpreter方法
    @Override
    public int interpreter() {
        //调用interpreter方法是为了转成int类型
        System.out.println("----- 求和结果输出 -----");
        return this.firstExpression.interpreter() + this.secondExpression.interpreter();
    }
    //重写toString方法
    @Override
    public String toString() {
        return "+";
    }
}
