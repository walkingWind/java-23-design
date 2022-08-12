package part19.math;

/**
 * @Author zhengcan
 * @Date 2022/8/5 17:37
 * @Version 1.0
 * @Description 乘法解释器
 */
public class MultiInterpreter  implements Interpreter{
    //第一个表达式
    private Interpreter firstExpression;
    //第二个表达式
    private Interpreter secondExpression;

    //构造器注入
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    //重写解释器的interpreter方法
    @Override
    public int interpreter() {
        //调用interpreter方法是为了转成int类型
        System.out.println("----- 求积结果输出 -----");
        return this.firstExpression.interpreter() * this.secondExpression.interpreter();
    }
    //重写toString方法
    @Override
    public String toString() {
        return "*";
    }
}
