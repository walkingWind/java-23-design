package part13;

import part13.template.BossTemplate;
import part13.template.EmployTemplate;

/**
 * @Author zhengcan
 * @Date 2022/8/4 9:17
 * @Version 1.0 行为型模式
 * @Description 模版方法模式
 *
 * 定义了一个算法的骨架，而将一些步骤延迟到子类中，让子类去控制部分逻辑
 * WorkTemplate里的钩子方法
 *
 */
public class Part13Main {
    public static void main(String[] args) {
        EmployTemplate employTemplate = new EmployTemplate();
        employTemplate.templateMethod();

        System.out.println("----------------------------");

        BossTemplate myTemplate = new BossTemplate();
        myTemplate.templateMethod();
    }
}
