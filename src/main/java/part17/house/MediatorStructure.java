package part17.house;

import part17.user.HouseOwner;
import part17.user.Person;
import part17.user.Tenant;

/**
 * @Author zhengcan
 * @Date 2022/8/5 15:43
 * @Version 1.0
 * @Description 具体中介者
 */
public class MediatorStructure extends Mediator{
    /**
     * 中介者需要知道房主是谁
     */
    private HouseOwner houseOwner;
    /**
     * 中介者需要知道承租者是谁
     */
    private Tenant tenant;

    public MediatorStructure() {
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /**
     * 重写联络方法
     * @param message
     * @param person
     */
    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner){
            //将房主的信息反馈给承租者
            this.tenant.getMessage(message);
        }else {
            //将承租者的信息反馈给房主
            this.houseOwner.getMessage(message);
        }
    }

}
