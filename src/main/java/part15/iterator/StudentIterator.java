package part15.iterator;

import part15.domain.Student;

/**
 * @Author zhengcan
 * @Date 2022/8/5 14:11
 * @Version 1.0
 * @Description  抽象迭代器类
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
