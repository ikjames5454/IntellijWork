package tdd;

import Interface.ChewingGum;
import Interface.GirlFriend;
import Interface.SugarDaddy;
import Interface.YahooBoy;
import org.junit.Test;

public class GirlFriendTest {
    @Test
    public void testICanSpendOnGirlFriend() {
        GirlFriend girl = new GirlFriend(new ChewingGum());
        girl.spending();

        GirlFriend babe = new GirlFriend(new YahooBoy());
        babe.spending();

        GirlFriend myBaby = new GirlFriend(new SugarDaddy());
        myBaby.spending();
    }
}
