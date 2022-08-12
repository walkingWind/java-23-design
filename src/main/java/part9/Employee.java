package part9;

/**
 * @Author zhengcan
 * @Date 2022/8/3 15:21
 * @Version 1.0
 * @Description
 */
import java.util.ArrayList;
import java.util.List;

/**
 * 雇员类
 * 这个类是组合模式的精髓，就是本身类里，还带有一个下级雇员关系
 * 这样的设计，就是组合模式
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    /**
     * 下级雇员
     */
    private List<Employee> subordinates;

    // constructor
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
