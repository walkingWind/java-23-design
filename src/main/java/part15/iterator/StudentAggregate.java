package part15.iterator;

import part15.domain.Student;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:14
 * @Version 1.0
 * @Description 学生迭代器
 * 定义抽象容器类，包含添加元素，删除元素，获取迭代器对象的方法
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
