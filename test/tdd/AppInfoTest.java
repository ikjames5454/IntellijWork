package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppInfoTest {


    private AppInfo information;
    @BeforeEach
    public void startWith(){
        information = new AppInfo();
    }
    @Test
    public void testICanCreateEntry(){
        information.createEntry("username", "password");
        information.createEntry("amaka", "beautiful");
        assertEquals("username",information.findEntry("username").returnUserName());
        assertEquals("amaka",information.findEntry("amaka").returnUserName());

    }
    @Test
    public void testICanDeleteEntry(){
        information.createEntry("amaka", "beautiful");
        information.deleteEntry("amaka","beautiful");
        assertThrows(NullPointerException.class,()->information.findEntry("amaka"));
    }

}
