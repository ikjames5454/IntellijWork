package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiaryTest {
    @Test
    public void testThatIHaveADiary(){
        Diary diary = new Diary("userName","pin");
        assertNotNull(diary);
    }

    @Test
    public void testThatDairyCanLock(){
        Diary diary = new Diary("userName","pin");
        diary.lock();
        assertTrue(diary.isLock("pin"));
        diary.lock();
        assertFalse(diary.isLock("pin"));
        diary.lock();
        assertTrue(diary.isLock("pin"));
    }
    @Test
    public void testThatDiaryCanBeCreated(){
        Diary diary = new Diary("userName","pin");
        diary.lock();
        assertTrue(diary.isLock("pin"));
        diary.lock();
        assertFalse(diary.isLock("pin"));
        diary.entry(1,"God is good","Trust in the Lord with all your heart");
        diary.array(1);
        assertEquals("God is good",diary.array(1).getTitle());
        assertEquals("Trust in the Lord with all your heart",diary.array(1).getBody());
    }
    @Test
    public void testThatDiaryCanDeleteEntry(){
        Diary diary = new Diary("userName","pin");
        diary.lock();
        assertTrue(diary.isLock("pin"));
        diary.lock();
        assertFalse(diary.isLock("pin"));
        diary.entry(1,"God is good","Trust in the Lord with all your heart");
        diary.array(1);
        assertEquals("God is good",diary.array(1).getTitle());
        diary.remove(1);
        assertNull(diary.array(1));


    }
}
