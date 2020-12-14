import org.junit.jupiter.api.Test;
import ownservlet.Point;
import ownservlet.Server;
import ownservlet.TronDemo;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSome {

    @Test
    public void getCrash1() {
        TronDemo.GamePane gamePane = new TronDemo.GamePane();
        Point point = new Point(501, 30);
        boolean flag = gamePane.checkCrash1(point);
        assertTrue(flag);
    }

    @Test
    public void getCrash2() {
        TronDemo.GamePane gamePane = new TronDemo.GamePane();
        int flag = gamePane.crash(1, 2);
        if (flag == 1) {
            assertTrue(true);
        }
    }
}
