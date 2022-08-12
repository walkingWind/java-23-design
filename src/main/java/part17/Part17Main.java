package part17;

import part17.house.MediatorStructure;
import part17.user.HouseOwner;
import part17.user.Tenant;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:04
 * @Version 1.0 行为型模式
 * @Description 中介者模式
 * 定义：
 * 又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 *
 * 【例】租房
 * 现在租房基本都是通过房屋中介，房主将房屋托管给房屋中介，而租房者从房屋中介获取房屋信息。房屋中介充当租房者与房屋所有者之间的中介者。
 *
 * 参考
 * https://blog.csdn.net/JavaBoy_XZL/article/details/122855598
 */
public class Part17Main {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        //创建房主对象，房主只需要知道中介
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        //创建承租者对象，承租者也只需要知道中介
        Tenant tenant = new Tenant("李四",mediator);
        //中介需要知道房主和承租者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        //承租者与中介联系
        tenant.contact("我需要租三室一厅的房子");
        //房主与中介联系
        houseOwner.contact("我这里有三室一厅的房子，你要租吗？");


    }
}
