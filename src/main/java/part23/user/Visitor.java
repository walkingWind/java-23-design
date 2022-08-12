package part23.user;

import part23.computer.Games;
import part23.computer.Photos;

/**
 * @Author zhengcan
 * @Date 2022/8/12 9:56
 * @Version 1.0
 * @Description
 */
public interface Visitor {
    void visit(Games games);
    void visit(Photos photos);

}
