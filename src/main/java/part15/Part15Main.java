package part15;

import part15.domain.Student;
import part15.iterator.StudentAggregate;
import part15.iterator.StudentAggregateImpl;
import part15.iterator.StudentIterator;

/**
 * @Author zhengcan
 * @Date 2022/8/5 13:58
 * @Version 1.0 行为型模式
 * @Description 迭代器模式
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 *
 * 这种模式用于变量集合的
 *
 * 使用场景
 * 当需要为聚合对象提供多种遍历方式时。
 * 当需要为遍历不同的聚合结构提供一个统一的接口时。
 * 当访问一个聚合对象的内容而无须暴露其内部细节的表示时。
 */
public class Part15Main {
    public static void main(String[] args) {
        //创建自己的学生集合类,添加元素,这个类似自己写的list。
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("李四"));
        studentAggregate.addStudent(new Student("王五"));
        studentAggregate.addStudent(new Student("张三"));

        //开始获取迭代器遍历
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }


    }
}
