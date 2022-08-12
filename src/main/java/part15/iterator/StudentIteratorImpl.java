package part15.iterator;

import part15.domain.Student;

import java.util.List;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:12
 * @Version 1.0
 * @Description 迭代器类实现
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }

}
