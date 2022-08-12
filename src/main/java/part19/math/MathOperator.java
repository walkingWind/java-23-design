package part19.math;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author zhengcan
 * @Date 2022/8/5 17:44
 * @Version 1.0
 * @Description 简单计算类
 */
public class MathOperator {


    private Queue<Interpreter> numQueue = new ConcurrentLinkedQueue<>();

    /**
     * 解析表达式
     * @param exp 表达式
     * @return
     */
    public int analysis(String exp) throws InterruptedException {
        String[] strs = exp.split(" ");
        boolean isAdd =false;
        for(String s:strs){
            if("*".equals(s)){
                //
                isAdd = false;
            }else if("+".equals(s)){
                //
                isAdd = true;
            }else {
                this.numQueue.offer(new NumberInterpreter(Integer.valueOf(s)));//添加元素
            }

        }
        if(isAdd){
            return new AddInterpreter(numQueue.poll(),numQueue.poll()).interpreter();
        }else {
            return new MultiInterpreter(numQueue.poll(),numQueue.poll()).interpreter();
        }

    }


}
