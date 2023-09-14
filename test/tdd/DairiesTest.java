package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DairiesTest {
    @Test
    public void test_i_can_add_dairy_to_dairies() {
        Diaries diaries = new Diaries();
        diaries.add("myDiary", "1234");
        diaries.findByUsername("myDiary");
        assertEquals("myDiary", diaries.findByUsername("myDiary").getMyDiaryName());
        diaries.add("jamesBond", "1234");
        diaries.findByUsername("jamesBond");
        assertEquals("jamesBond", diaries.findByUsername("jamesBond").getMyDiaryName());
    }

    @Test
    public void test_i_can_find_dairy_by_Username(){
        Diaries diaries = new Diaries();
        diaries.add("myPrecious", "1234");
        diaries.findByUsername("myPrecious");

    }

    @Test
    public void test_i_can_delete_dairy_from_dairies() {
        Diaries diaries = new Diaries();
        diaries.add("jamesBond", "1234");
        diaries.findByUsername("jamesBond");
        assertEquals("jamesBond", diaries.findByUsername("jamesBond").getMyDiaryName());
        diaries.delete("jamesBond", "1234");
        assertNull(diaries.findByUsername("jamesBond"));
    }


}

