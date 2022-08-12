package part19;

import part19.math.MathOperator;

/**
 * @Author zhengcan
 * @Date 2022/8/5 17:24
 * @Version 1.0 行为型模式
 * @Description 解释器模式
 * 提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 *
 * 设计一个简单的计算器
 *
 */
public class Part19Main {
    public static void main(String[] args) throws Exception{

        String str1 = "1 + 2";
        String str2 = "5 * 2";
        MathOperator mathOperator = new MathOperator();
        int analysis1 = mathOperator.analysis(str1);
        System.out.println(analysis1);
        int analysis2 = mathOperator.analysis(str2);
        System.out.println(analysis2);
    }
}
