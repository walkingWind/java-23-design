package part10;

/**
 * @Author zhengcan
 * @Date 2022/8/3 15:28
 * @Version 1.0 结构型模式
 * @Description 外观模式
 *  为了方便客户的使用，把一群操作，封装成一个方法。
 *
 *  说白了，就是本来很多个独立方法，最后封装成1个就叫外观模式。
 *  这可能是最扯淡的模式了
 */
public class Part10Main {

    public static void main(String[] args) {
        System.out.println("见下面方法及说明");
    }

}


    /**
     * 外观模式设计
     *
     * 需求：我比较喜欢看电影，于是买了投影仪、电脑、音响、设计了房间的灯光、买了爆米花机，然后我想看电影的时候，我需要一键观影和一键关闭。
     *
     * 一键观影
    public void watchMovie() {
        computer.on();
        light.down();
        popcornPopper.on();
        popcornPopper.makePopcorn();
        projector.on();
        projector.open();
        player.on();
        player.make3DListener();
    }
     */


    /**
     * 最后测试：一键观影：
        new HomeTheaterFacade(computer, light, player, popcornPopper, projector).watchMovie();
    */
