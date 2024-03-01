package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    private Diary diary;
    private Entry myDiary;

    @BeforeEach
    public void initializeDiary(){
        diary = new Diary("chichi","1234");
    }


    @Test
    public void testThatThereIsADiary(){
        assertTrue(diary.isLocked());
        System.out.println(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeUnLockedWithPasswordOnly(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testToCreateAnEntry(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
        diary.createEntry("Short story","My wost dat in semicolon");
        assertEquals(1,diary.getEntries());

    }

    @Test
    public void testToCreateTwoEntry(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
        diary.createEntry("Short story","My wost days in semicolon");
        diary.createEntry("My story","My journey sofar");
        assertEquals(2,diary.getEntries());

    }


   @Test
    public void testToDeleteEntry(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
        diary.createEntry("Short story","My wost days in semicolon");
        diary.createEntry("My story","My journey sofar");
        diary.deleteEntry(11);
        assertEquals(1,diary.getEntries());
        System.out.println(diary.getEntries());

    }

    @Test
    public void testToFindEntry(){
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
        diary.createEntry("Story","My worst days in semicolon");
        Entry myId = diary.findEntry(11);
        assertEquals(myId, diary.findEntry(11));
    }

    @Test
    public void testToUpdateEntry(){
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
        diary.createEntry("Story","My worst days in semicolon");
        diary.upDateEntry(10,"myStory","It's another day in semicolon");
        Entry dated= diary.findEntry(10);

        assertEquals("myStory",dated.getTitle());
        assertEquals("It's another day in semicolon",dated.getBody());


    }







}