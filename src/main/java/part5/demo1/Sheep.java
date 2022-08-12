package part5.demo1;

import lombok.Data;

/**
 * @Author zhengcan
 * @Date 2022/8/2 13:51
 * @Version 1.0
 * @Description
 */
@Data
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address="蒙古羊";
    private Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
