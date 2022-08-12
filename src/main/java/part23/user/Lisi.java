package part23.user;

import part23.computer.Games;
import part23.computer.Photos;

/**
 * @Author zhengcan
 * @Date 2022/8/12 9:58
 * @Version 1.0
 * @Description
 */
public class Lisi implements Visitor{
    @Override
    public void visit(Games games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        photos.watch();
    }
}
