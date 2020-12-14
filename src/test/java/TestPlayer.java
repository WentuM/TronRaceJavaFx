import org.junit.jupiter.api.Test;
import ownservlet.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPlayer {

    @Test
    public void getPlayer() {
        Board board = new Board();
        Car player = board.getPlayer(1);
        boolean flag = false;
        if (player.getDir().equals("r")) {
            flag = true;
        }
        assertTrue(flag);
    }
}