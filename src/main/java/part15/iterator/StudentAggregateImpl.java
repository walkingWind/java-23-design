package part15.iterator;

import part15.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:15
 * @Version 1.0
 * @Description 学生迭代器方法
 */
public class StudentAggregateImpl implements StudentAggregate{

    // 学生列表
    private List<Student> list = new ArrayList<Student>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
