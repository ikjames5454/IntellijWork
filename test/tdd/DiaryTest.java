package tdd;

import Exercises.Entry;
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
        assertFalse(diary.isLock());
        diary.lock();
        assertTrue(diary.isLock());
    }
    @Test
    public void testThatDiaryCanUnlock(){
        Diary diary = new Diary("userName","pin");
        diary.lock();
        assertTrue(diary.isLock());
        diary.unLock("pin");
        assertFalse(diary.isLock());


    }
    @Test
    public void testThatDiaryCanBeEnteredAndFindEntryByID(){
        Diary diary = new Diary("userName","pin");
        assertFalse(diary.isLock());
        diary.createEntry("God is good","Trust in the Lord with all your heart");
        assertEquals("God is good",diary.findEntry(1).getTitle());
        assertEquals("Trust in the Lord with all your heart",diary.findEntry(1).getBody());
    }
    @Test
    public void testThatDiaryCanDeleteEntry(){
        Diary diary = new Diary("userName","pin");
        assertFalse(diary.isLock());
        diary.createEntry("God is good","Trust in the Lord with all your heart");
        diary.findEntry(1);
        assertEquals("God is good",diary.findEntry(1).getTitle());
        diary.remove(1);
        assertThrows(NullPointerException.class, ()->diary.findEntry(1));


    }
    @Test
    public void testThatICanUpdateMyDiary(){
        Diary diary = new Diary("userName","pin");
        assertFalse(diary.isLock());
        diary.createEntry("God is good","Trust in the Lord with all your heart");
        diary.upDateEntry(1, "God","i trust in you");
        assertEquals(new Entry(1, "God","i trust in you"),diary.findEntry(1));

    }
}
